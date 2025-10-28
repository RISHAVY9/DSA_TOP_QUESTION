class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        // prefix[i] = sum of nums[0..i-1]
        long prefix = 0;
        // total sum of nums
        long total = 0;
        for (int v : nums) total += v;
        
        int ans = 0;
        // Iterate possible start index i
        for (int i = 0; i < n; i++) {
            // If nums[i] == 0, only then we can start at i
            if (nums[i] == 0) {
                // sum of left side = prefix
                long leftSum  = prefix;
                // sum of right side = total - prefix - nums[i]
                long rightSum = total - prefix - nums[i];
                
                // If leftSum == rightSum then starting at i works
                if (leftSum == rightSum) {
                    ans++;
                }
            }
            prefix += nums[i];
        }
        
        return ans;
    }
}
