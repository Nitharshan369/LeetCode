class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for (int x : nums) totalSum += x;
        
        if (totalSum % 2 != 0) return 0;

        long leftSum = 0;
        long rightSum = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];

            rightSum = totalSum - leftSum;

            if ((rightSum - leftSum) % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }
}