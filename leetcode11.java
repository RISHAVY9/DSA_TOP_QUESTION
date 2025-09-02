https://youtu.be/w7ftYsZtIbs

public class Solution {
    public int maxArea(int[] height) {
        int l = 0;                        
        int r = height.length - 1;       
        int ans = 0;                     

        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int area = minHeight * (r - l);
            ans = Math.max(ans, area);

            // Move the pointer at the shorter line inward
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
