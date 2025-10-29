class Solution {
    public int smallestNumber(int n) {
        // Find k such that (1 << k) - 1 >= n
        int k = 32 - Integer.numberOfLeadingZeros(n); 
        // Explanation: bitLength of n is k, so 1<<k is >= 2^(k-1)*2 = 2^k, thus (1<<k)-1 >= n
        return (1 << k) - 1;
    }
}
