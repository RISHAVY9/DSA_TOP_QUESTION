https://youtu.be/PnyxRdn-N9U



import java.util.*;

class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        // Find minimum and maximum values
        int minE = Arrays.stream(nums).min().getAsInt();
        int maxE = Arrays.stream(nums).max().getAsInt();

        // Build a frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Reconstruct the sorted array
        int idx = 0;
        for (int num = minE; num <= maxE; num++) {
            int count = freq.getOrDefault(num, 0);
            while (count > 0) {
                nums[idx++] = num;
                count--;
            }
        }

        return nums;
    }
}
