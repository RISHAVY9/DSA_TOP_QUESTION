//Missing Number | LeetCode problem 268

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0 ;
        for (int i = 0 ; i <nums.length ; i ++){
            sum = sum + nums[i];
        }
        int actualSum=(nums.length *(nums.length+1))/2 ;
        int missingnum = actualSum - sum ;
         return missingnum ;
         

        
    }
}
