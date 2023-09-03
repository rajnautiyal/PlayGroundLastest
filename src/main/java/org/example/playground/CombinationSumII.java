package org.example.playground;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumII {

    public static void combinationSum2(int[] candidates, int target, List<Integer> combination, List<List<Integer>> orginaList, int start)
    {
        if(target==0){
            orginaList.add(new ArrayList<>(combination));

            combination.stream().forEach(element -> System.out.print(element+" "));

            //System.out.println("target is zero");
            //combination=new ArrayList<>();
            return ;
        }else{
            if(target<0){
                //combination=new ArrayList<>();
                return;
            }
        }
        for(int i=start;i<candidates.length;i++){
            combination.add(candidates[i]);
            combinationSum2(candidates, target-candidates[i], combination,  orginaList, i+1);
            combination.remove(combination.size()-1);
        }
    }

    public static void main(String args[]){
        int[] candidates=new int[]{10,1,2,7,6,1,5};
        int target = 15;


        List<List<Integer>> orginaList= new ArrayList<>();
        List<Integer> combination=new ArrayList<>();
        combinationSum2(candidates, target, combination,  orginaList, 0);
    }
}
