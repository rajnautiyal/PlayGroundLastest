package org.example.playground;

public class MergeSort {
    private int num[];
    private int temp[];

    public  MergeSort(int[] num){
        this.num=num;
        this.temp=new int[num.length];
    }

    public void sort(){
        mergeSort(0,num.length-1);
    }

    private void mergeSort(int low, int high) {
            if(low >= high){
            return;
        }
        int middleIndex=(low+high)/2;

        mergeSort(0,middleIndex);
        mergeSort(middleIndex+1,high);
        merge(low,middleIndex,high);
    }

    private void merge(int low, int middleIndex, int high) {
        for(int i=0;i<=high;i++)
            temp[i]=num[i];

            System.out.println("copying the item ---->"+ low +" high : "+ high);
            int i = low;
            int j = middleIndex + 1;
            int k = low;
            while (i<=middleIndex && j<=high){
                if(temp[i]<temp[j]){
                    num[k]=temp[i];
                    ++i;
                }else{
                    num[k]=temp[j];
                    j++;
                }
               k++;
            }
            while (i<=middleIndex){
                num[k]=temp[i];
                i++;
                k++;
            }
        while (j<=high){
            num[k]=temp[j];
            j++;
            k++;
        }

    }

    public void showArray(){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");

        }
    }
    private void swap(int i, int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;

    }

}
