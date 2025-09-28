import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2 & 3: Iterate from the end and check triangle inequality
        for (int i = nums.length - 1; i >= 2; i--) {
            // Check if nums[i-2] + nums[i-1] > nums[i]
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                // Step 4: Return the perimeter
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        // Step 5: Handle no solution
        return 0;
    }
}
