https://youtu.be/jkSNEdDMFKA


class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0L;
        long consecutiveZeros = 0L;

        for (int n : nums) {
            if (n == 0) {
                count += ++consecutiveZeros;
            } else {
                consecutiveZeros = 0;
            }
        }
        return count;
    }
}
