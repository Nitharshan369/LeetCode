package Others;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;

        for (int n : nums) {
            while (!stack.isEmpty() && stack.peekLast() > n) {
                stack.pollLast();
            }

            if (n > 0 && (stack.isEmpty() || n != stack.peekLast())) {
                res += 1;
                stack.addLast(n);
            }
        }

        return res;
    }
}