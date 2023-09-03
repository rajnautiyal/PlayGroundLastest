package org.example.playground;

public class Search2DMetrics74 {

        public static boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            if (m == 0)
                return false;
            int n = matrix[0].length;

            // binary search
            int left = 0, right = m * n - 1;
            int pivotIdx, pivotElement;
            while (left <= right) {
                pivotIdx = (left + right) / 2;
                System.out.println("pivotIdx: "+pivotIdx +"  left: "+left+ "    right:  "+right+"----- : "+(pivotIdx / n)+ "  "+(pivotIdx % n));
                pivotElement = matrix[pivotIdx / n][pivotIdx % n];
                if (target == pivotElement)
                    return true;
                else {
                    if (target < pivotElement)
                        right = pivotIdx - 1;
                    else
                        left = pivotIdx + 1;
                }
            }
            return false;
        }





    public static void main(String args[]){
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result=searchMatrix(matrix,30);
        System.out.println(result);
    }
}
