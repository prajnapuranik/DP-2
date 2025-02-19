// Time Complexity : O (N * amount)
// Space Complexity : O(amount) 
// Did this code successfully run on Leetcode : Yes

//Problem statement: https://leetcode.com/problems/coin-change-2/

class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int x = coin; x < amount + 1; ++x) {
                dp[x] += dp[x - coin];
            }
        }
        return dp[amount];
    }
}

