package org.example;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestSkill {
    public static void main(String args[]){
        String test="rrajjeddder";
        Queue<Character> queue1=new PriorityQueue<>();
        for(int i=0;i<test.length();i++){
           if(!queue1.contains(test.charAt(i))){
               queue1.add(test.charAt(i));
           }else{
               queue1.remove(test.charAt(i));
           }
        }
        System.out.println("rajendra-----"+queue1.peek());

    }
}
