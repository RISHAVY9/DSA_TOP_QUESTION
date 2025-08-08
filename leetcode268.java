//Missing Number | LeetCode problem 268
https://www.youtube.com/watch?v=cuNX7rijdt8&pp=ygUdbGVldGNvZGUgcHJvYmxlbSBpbiBqYXZhIDI2OCA%3D



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
