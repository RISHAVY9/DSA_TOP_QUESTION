//Single Number | LeetCode problem 136 

https://www.youtube.com/watch?v=dUmaWUPRcLQ&pp=ygUcbGVldGNvZGUgcHJvYmxlbSBpbiBqYXZhIDEzNg%3D%3D



class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        for (int n : nums) {
            result ^= n;
        }
        return result;
    }
}
