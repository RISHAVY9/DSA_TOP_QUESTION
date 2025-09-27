import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int maxLen = 0;
        // Map to store character and its last index
        Map<Character, Integer> map = new HashMap<>();
        
        // i is the left pointer, j is the right pointer
        for (int j = 0, i = 0; j < n; j++) {
            char currentChar = s.charAt(j);
            
            // If the character is found in the current window (its index >= i),
            // move the left pointer i to the position after the last occurrence
            if (map.containsKey(currentChar) && map.get(currentChar) >= i) {
                i = map.get(currentChar) + 1;
            }
            
            // Update the character's index in the map
            map.put(currentChar, j);
            
            // Update the maximum length found so far
            maxLen = Math.max(maxLen, j - i + 1);
        }
        
        return maxLen;
    }
}
