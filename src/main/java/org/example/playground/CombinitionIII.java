package org.example.playground;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinitionIII {
    public static void combination(int remain, int next_number, LinkedList result, int numbertime,int size){
        if(result.size()==size && remain==0) {
            System.out.println(result);
            return;
        }else{
            if(remain<0  || result.size() == size){
                return;
            }
        }
        for(int i=next_number;i<=numbertime;i++){
            result.add(i);
            combination(remain-i, i+1, result, numbertime,size);
            result.removeLast();
        }
    }



    public static void main(String args[]){
        int remain= 3;
        int n = 9;
       int numbertime=n-remain;
        LinkedList comb=new LinkedList<Integer>();
        combination(n, 1, comb, numbertime,remain);

    }
}
