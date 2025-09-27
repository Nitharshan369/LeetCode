class Solution {
    public double largestTriangleArea(int[][] points) {
        int N = points.length;
        double ans = 0.0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int[] P = points[i];
                    int[] Q = points[j];
                    int[] R = points[k];

                    double area = 0.5 * Math.abs(
                        P[0] * (Q[1] - R[1]) + 
                        Q[0] * (R[1] - P[1]) +
                        R[0] * (P[1] - Q[1])
                    );

                    ans = Math.max(ans, area);
                }
            }
        }
        return ans;
    }
}