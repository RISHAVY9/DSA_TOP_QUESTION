LINK = https://www.youtube.com/watch?v=_qOPk5FC2NU&pp=ygUabGVldGNvZGUgNzA0IGphdmEgc29sdXRpb24%3D
public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Optional early exit if target is outside boundaries
        if (target < nums[left] || target > nums[right]) {
            return -1;
        }

        while (left <= right) {
            // Avoid overflow with mid calculation
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
