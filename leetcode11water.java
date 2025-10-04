public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate current height (limited by the shorter line)
            int minHeight = Math.min(height[left], height[right]);
            
            // Calculate the width
            int width = right - left;
            
            // Calculate the current area
            int currentArea = minHeight * width;
            
            // Update the maximum area found so far
            maxArea = Math.max(maxArea, currentArea);
            
            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
