https://youtu.be/Y6B-7ZctiW8

class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int dpMax = nums[0];
        int dpMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int prevMax = dpMax;
            int prevMin = dpMin;

            if (num < 0) {
                // Swapping effect: negatives invert min/max behavior
                dpMax = Math.max(prevMin * num, num);
                dpMin = Math.min(prevMax * num, num);
            } else {
                dpMax = Math.max(prevMax * num, num);
                dpMin = Math.min(prevMin * num, num);
            }

            ans = Math.max(ans, dpMax);
        }

        return ans;
    }
}

