class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumedBottles = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            consumedBottles += newBottles;
            emptyBottles = newBottles + (emptyBottles % numExchange);
        }

        return consumedBottles;
    }
}