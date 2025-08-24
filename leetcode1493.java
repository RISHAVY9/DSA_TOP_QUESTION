https://youtu.be/twOZ7QVMlXM

class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0, zeros = 0;
        for (int num : nums) {
            if (num == 0) zeros++;
            if (zeros > 1) {
                if (nums[l] == 0) zeros--;
                l++;
            }
        }
        // After processing, remaining window length minus one deletion
        return nums.length - l - 1;
    }
}
