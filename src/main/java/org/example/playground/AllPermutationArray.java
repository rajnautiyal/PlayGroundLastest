package org.example.playground;

import java.util.ArrayList;

public class AllPermutationArray {

    public static void permutation(int[] nums, int start, ArrayList<Integer> list){
        if(start == nums.length){
            System.out.println("---->>>" + list);
            return;
        }
        for(int i = start; i < nums.length; i++){
            swap(nums, start, i);
            list.add(nums[start]);
            permutation(nums, start + 1, list);
            list.remove(list.size() - 1); // Remove the last element added for backtracking
            swap(nums, start, i);
        }
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args){
        int[] nums = new int[] {1, 3, 2};
        permutation(nums, 0, new ArrayList<>());
    }
}
