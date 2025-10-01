class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            // 1. Calculate new bottles from exchange
            int newBottles = emptyBottles / numExchange;

            // 2. Add them to total drunk
            totalDrunk += newBottles;

            // 3. Update empty bottles: leftover empties + the new empties (from drinking newBottles)
            emptyBottles = (emptyBottles % numExchange) + newBottles;
        }

        return totalDrunk;
    }
}
