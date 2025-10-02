public class Solution {
    /**
     * Calculates the maximum number of water bottles that can be drunk.
     * The exchange rate increases by one after each exchange.
     *
     * @param numBottles The initial number of full water bottles.
     * @param numExchange The initial number of empty bottles required for an exchange.
     * @return The maximum number of bottles drunk.
     */
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        // 'emptyBottles' keeps track of the total number of empty bottles we have
        int emptyBottles = numBottles;
        // 'bottleDrinks' keeps track of the total number of bottles we've drunk
        int bottleDrinks = numBottles;

        // Continue exchanging as long as we have enough empty bottles for the current exchange rate
        while (emptyBottles >= numExchange) {
            // 1. Perform the exchange: We get one new full bottle
            bottleDrinks += 1;

            // 2. Update empty bottles:
            //    - We used 'numExchange' empty bottles for the exchange (emptyBottles - numExchange).
            //    - We gained 1 new empty bottle from drinking the newly obtained full bottle (+ 1).
            emptyBottles = (emptyBottles - numExchange) + 1;

            // 3. Increment the exchange rate for the next exchange
            numExchange++;
        }

        return bottleDrinks;
    }
}
