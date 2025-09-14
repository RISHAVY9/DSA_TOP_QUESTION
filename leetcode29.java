class Solution {
    public int divide(int dividend, int divisor) {
        // Handle edge case of overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        // Use long to handle Integer.MIN_VALUE
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);

        long quotient = 0;

        while (longDividend >= longDivisor) {
            long tempDivisor = longDivisor;
            long multiple = 1;

            // Find the largest multiple of divisor that is less than or equal to dividend
            while ((longDividend - (tempDivisor << 1)) >= 0) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the found multiple and add to the quotient
            longDividend -= tempDivisor;
            quotient += multiple;
        }

        // Apply the sign and handle potential overflow
        return (int) (sign * quotient);
    }
}
