package org.example.playground;

class CircularArray {
    public static boolean search(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        int mid=(high+low)/2;

        while(low<high){
            if(nums[mid]==target)
                return true;

            if(nums[low]<nums[mid]){
                if(nums[high]<target){
                    System.out.println("inside===> ");
                    high=mid+1;
                    System.out.println(high);
                }else{
                    low=mid-1;
                }
            }
            if(nums[low]>nums[mid]){
                System.out.println("inside "+mid);
                if(nums[high]<target){
                    high=mid-1;
                    System.out.println("inside ==>pppp"+ high+" "+ low);
                }else{
                    low=mid+1;
                }
            }
            mid=(low+high)/2;
            System.out.println("priting mid ==>pppp"+ mid);
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 3));
    }
}
