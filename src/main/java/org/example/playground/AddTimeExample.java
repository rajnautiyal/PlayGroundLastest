package org.example.playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTimeExample {
    public static void main(String[] args) {
        // Define two time strings
        String time1 = "6:00:59";
        String time2 = "13:01:06";


        // Split the time strings into hours, minutes, and seconds
        String[] parts1 = time1.split(":");
        String[] parts2 = time2.split(":");
        int reminder=0;
        List<Integer> str=new ArrayList<>();
        for(int i=parts1.length-1;i>=0;i--){
           if(i!=0)
            reminder = getReminder(reminder, str, parts1[i],parts2[i],60);
           else getReminder(reminder, str, parts1[0],parts2[0],24);
        }
        Collections.reverse(str);
        str.stream().forEach(i->System.out.print(i +" "));

    }

    private static int getReminder(int reminder, List<Integer> str, String parts1,String parts2,int div) {
        int t1=Integer.parseInt(parts1);
        int t2=Integer.parseInt(parts2);
        int totalSeconds=t1+t2+ reminder;
             reminder=0;
            int sum = totalSeconds % div;
            str.add(sum);
            reminder = totalSeconds / div;
        return reminder;
    }
}
