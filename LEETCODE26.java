//#26: Remove Duplicates from Sorted Array


https://www.youtube.com/watch?v=xnj-GjdboGE&t=271s&pp=ygUbbGVldGNvZGUgcHJvYmxlbSBpbiBqYXZhIDI2

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
