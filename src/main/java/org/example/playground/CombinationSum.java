package org.example.playground;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    int remain=0;
    public static void sum(int[] candiate, int target, LinkedList<Integer> comb,int start, int remain,List<List<Integer>> results){
        if (remain == 0) {
            // make a deep copy of the current combination
            results.add(new ArrayList<Integer>(comb));
            return;
        } else if (remain < 0) {
            // exceed the scope, stop exploration.
            return;
        }
        for(int i=start; i<candiate.length;i++){
            comb.add(candiate[i]);
            System.out.println("i== "+i+"  start:  "+start);
            sum(candiate, target,  comb,i, remain-candiate[i],results);
            comb.removeLast();
        }
    }


    protected static void backtrack(
            int remain,
            LinkedList<Integer> comb,
            int start, int[] candidates,
            List<List<Integer>> results) {

        if (remain == 0) {
            // make a deep copy of the current combination
            results.add(new ArrayList<Integer>(comb));
            return;
        } else if (remain < 0) {
            // exceed the scope, stop exploration.
            return;
        }

        for (int i = start; i < candidates.length; ++i) {
            // add the number into the combination
            comb.add(candidates[i]);
            backtrack(remain - candidates[i], comb, i, candidates, results);
            // backtrack, remove the number from the combination
            comb.removeLast();
        }
    }
    public static void main(String args[]) {

        int[] candidates =new int[]{2,3,6,7};
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        int target = 7;
        LinkedList<Integer> comb = new LinkedList<Integer>();
        System.out.println("--****");

        sum(candidates, target, comb,0, target,results);
        System.out.println("--****");


       // backtrack(target, comb, 0, candidates,results);
        System.out.println("------");

        for (List<Integer> innerList : results) {
            for (Integer value : innerList) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}