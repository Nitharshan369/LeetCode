class Solution {
    public int minimumOperations(int[] nums) {
        int len = nums.length;
        int res = 0;
        int k = 3;
        for (int i = 0; i < len; i++) {
            if (nums[i] % k == 2 ) {
                nums[i] = nums[i] + 1;
                res += 1;
            } else if (nums[i] % k == 1) {
                nums[i] = nums[i] - 1;
                res += 1;
            } else if (nums[i] % k == 0) {
                nums[i] = nums[i];
            }
        }
        return res;
    }
}