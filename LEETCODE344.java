//LeetCode #344: Reverse String java solution

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = firstGreaterEqual(nums, target);
        if (left == nums.length || nums[left] != target) {
            return new int[]{-1, -1};
        }
        int right = firstGreaterEqual(nums, target + 1) - 1;
        return new int[]{left, right};
    }

    private int firstGreaterEqual(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
