package org.example.playground;

import java.util.HashMap;
import java.util.Map;


public class ExcelSheetColumnTitle {


    public static void main(String args[]){
       System.out.println( convertToTitle(2002));
    }

    public static String convertToTitle(int columnNumber) {

        Map<Integer, Character> charMap=new HashMap<Integer,Character>();
        int i=0;
        for(char ch='A';ch<='Z';ch++){
            charMap.put(i++,ch);
        }

        StringBuffer ans=new StringBuffer();
        while(columnNumber > 0){
            columnNumber=columnNumber-1;
            int num=columnNumber%26;
            System.out.println("num"+num);
            ans.append(String.valueOf(charMap.get(num)));
            columnNumber=columnNumber/26;

        }
        return ans.toString();
    }


}
