package org.example.playground;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static void main(String args[]) {

        String s="abcabcbb";
      int t=lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap();

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars.put(r, chars.getOrDefault(r,0) + 1);
            System.out.println("-----------"+r);



            while (chars.get(r) > 1) {

                System.out.println("start:    "+chars.get(r)+" left:  "+left+" right:  "+right);
                char l = s.charAt(left);

                System.out.println("middle:    "+l);


                chars.put(l, chars.get(l) - 1);
                left++;

                System.out.println("chars.get(r) : "+chars.get(r) );
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
}

