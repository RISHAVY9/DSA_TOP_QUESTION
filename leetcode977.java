LINK  = https://www.youtube.com/watch?v=KTcO-efZYU0

class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[] = new int [nums.length];
        int left = 0 ;
        int right = nums.length-1 ;
        for(int i = result.length-1 ; i>=0 ; i--){
            int LeftSquare = nums[left] * nums[left];
            int rightsquare = nums[right]* nums[right];
            if(LeftSquare > rightsquare){
                result[i] = LeftSquare ;
                left ++ ;
            }
            else{
                result[i]= rightsquare ;
                right-- ;


            }
        }

        return result ;

        
    }
}
