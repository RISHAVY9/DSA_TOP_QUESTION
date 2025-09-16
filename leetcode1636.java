import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Count frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        
        // Sort the array using custom comparator
        return Arrays.stream(nums)
                     .boxed() // becomes Integer[]
                     .sorted((a, b) -> {
                         int fa = freq.get(a), fb = freq.get(b);
                         if (fa != fb) {
                             return fa - fb;    // increasing frequency
                         } else {
                             return b - a;      // if same freq, decreasing value
                         }
                     })
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}
