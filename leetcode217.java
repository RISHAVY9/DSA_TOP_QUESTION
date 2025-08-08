https://www.youtube.com/watch?v=YlzXrmGTmy0&pp=ygUcbGVldGNvZGUgcHJvYmxlbSBpbiBqYXZhIDIxNw%3D%3D


import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
       
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
