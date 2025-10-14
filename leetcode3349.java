class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int maxValid = 0;
        int prevLen = 0;   // length of previous strictly increasing segment
        int currLen = 0;   // length of current strictly increasing segment

        for (int i = 0; i < n; i++) {
            currLen++;
            // if we are at last element or the increasing segment breaks
            if (i == n - 1 || nums.get(i) >= nums.get(i + 1)) {
                // Two possibilities:
                // 1. We can split this current segment into two halves → currLen / 2
                // 2. Use tail of previous segment and head of current → min(prevLen, currLen)
                maxValid = Math.max(maxValid, Math.max(currLen / 2, Math.min(prevLen, currLen)));

                // Move to next segment
                prevLen = currLen;
                currLen = 0;
            }
        }

        return maxValid >= k;
    }
}
