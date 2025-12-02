package HashMap;

import java.util.*;

class Solution {
    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> pointNum = new HashMap<>();
        long mod = 1_000_000_007L;
        for (int[] p : points) {
            pointNum.put(p[1], pointNum.getOrDefault(p[1], 0) + 1);
        }
        List<Integer> heights = new ArrayList<>(pointNum.keySet());
        Collections.sort(heights);

        long ans = 0;
        long totalSum = 0;

        for (int h : heights) {
            int cnt = pointNum.get(h);
            if (cnt >= 2) {
                long edges = (long) cnt * (cnt - 1) / 2; 
                ans = (ans + (edges % mod) * (totalSum % mod)) % mod;
                totalSum = (totalSum + edges) % mod;
            }
        }

        return (int) ans;
    }
}
