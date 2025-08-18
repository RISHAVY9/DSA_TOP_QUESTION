https://www.youtube.com/watch?v=9A4Bebss1WQ&pp=ygUZNjI4IGxlZXRjb2RlIGphdmEgc2x1dGlvbtIHCQmtCQGHKiGM7w%3D%3D


class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max(
            nums[n - 1] * nums[n - 2] * nums[n - 3],
            nums[n - 1] * nums[0] * nums[1]
        );
    }
}
