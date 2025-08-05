//27.REMOVE ELEMENT LEETCODE QUESTION 

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;  // write-pointer for next valid element
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
