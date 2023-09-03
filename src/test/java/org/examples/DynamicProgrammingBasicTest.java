package org.examples;

import org.junit.jupiter.api.Test;

import org.example.DynamicProgrammingBasic;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicProgrammingBasicTest {

    @Test
    public void testMinCoins() {
        int n = 11;
        int[] a = {1, 2, 5};
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;

        int result = DynamicProgrammingBasic.minCoins(n, a, dp);
        assertEquals(3, result); // Expected result is 3 coins (2 + 5 + 5) to make 11.

        // You can add more test cases as needed
    }
}
