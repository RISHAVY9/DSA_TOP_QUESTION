//Max Consecutive Ones | Leetcode 485
https://www.youtube.com/watch?v=pPVE4KZ1hsU&pp=ygUZbGVldGNvZGUgcHJvYmxlbSA0ODUgamF2YQ%3D%3D

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr = 0;
            }
        }
        return max;
    }
}
