class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3]; 
        dp[1] = dp[2] = Integer.MIN_VALUE;

        for (int x : nums) {
            int[] next = dp.clone();

            for (int r = 0; r < 3; r++) {
                if (dp[r] != Integer.MIN_VALUE) {
                    int newSum = dp[r] + x;
                    next[newSum % 3] = Math.max(next[newSum % 3], newSum);
                }
            }

            dp = next;
        }

        return dp[0]; 
    }
}