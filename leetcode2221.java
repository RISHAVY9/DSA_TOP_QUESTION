class Solution {
    public int triangularSum(int[] nums) {
        // The outer loop runs for n-1 iterations, where n is the initial length,
        // reducing the effective array size by 1 in each round.
        for (int currentLength = nums.length; currentLength > 1; currentLength--) {
            // The inner loop calculates the new elements for the current round.
            // We only need to compute up to the second-to-last element of the current size (i.e., currentLength - 1)
            for (int i = 0; i < currentLength - 1; i++) {
                // Update the current element in place with the sum of itself and the next element, modulo 10.
                // This simulates creating the new array 'newNums' where newNums[i] = (nums[i] + nums[i+1]) % 10,
                // and then replacing 'nums' with 'newNums'. By updating nums[i], we overwrite an element
                // that will not be used in the next round of calculations (since the effective length shrinks).
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }
        
        // After n-1 rounds, the final result is the first element of the array.
        return nums[0];
    }
}
