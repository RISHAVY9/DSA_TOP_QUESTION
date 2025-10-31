class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        final int MAX = 100;  // as per constraints n ≤ 100
        int[] ans = new int[2];
        int[] count = new int[MAX + 1];
        int idx = 0;

        for (int num : nums) {
            count[num]++;
            if (count[num] == 2) {
                ans[idx++] = num;
                // we know exactly two numbers repeat, we could break if idx==2
            }
        }

        return ans;
    }
}
