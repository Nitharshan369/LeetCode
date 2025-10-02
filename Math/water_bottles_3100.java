// Simulation Approach

class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            emptyBottles -= numExchange;
            numExchange++;
            ans++;
            emptyBottles++;
        }
        return ans;
    }
}
