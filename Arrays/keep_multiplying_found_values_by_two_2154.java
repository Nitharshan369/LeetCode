class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int num : nums) {
                if (num == original) {
                    original = 2 * original;
                    changed = true;
                    break;
                }
            }
        }
        return original;
    }
}