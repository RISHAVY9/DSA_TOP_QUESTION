//Move Zeros | LeetCode problem 283
https://www.youtube.com/watch?v=AgiGd763srg&pp=ygUcbGVldGNvZGUgcHJvYmxlbSAyODMgaW4gamF2YQ%3D%3D

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
}
