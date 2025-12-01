package HashMap;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int n : nums) {
            total += n;
        }

        long remain = total % p;
        if (remain == 0) {
            return 0;
        }

        int res = nums.length;
        long curSum = 0;

        Map<Long, Integer> remainToIdx = new HashMap<>();
        remainToIdx.put(0L, -1);

        for (int i = 0; i < nums.length; i++) {
            curSum = (curSum + nums[i]) % p;
            long prefix = (curSum - remain + p) % p;

            if (remainToIdx.containsKey(prefix)) {
                int length = i - remainToIdx.get(prefix);
                res = Math.min(res, length);
            }

            remainToIdx.put(curSum, i);
        }

        return res == nums.length ? -1 : res;
    }
}