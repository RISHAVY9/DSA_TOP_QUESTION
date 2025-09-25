public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        // If k <= 0 or small array, can early decide if needed
        if (nums == null || n <= 1 || k <= 0) {
            return false;
        }
        
        for (int i = 0; i < n; i++) {
            // We can stop j as far as i + k, not beyond array end
            for (int j = i + 1; j < n && j <= i + k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
