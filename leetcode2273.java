import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) return result;

        // Always include the first word
        result.add(words[0]);
        // Keep track of the “signature” (sorted form) of the last included word
        String prevSig = sortString(words[0]);

        for (int i = 1; i < words.length; i++) {
            String sig = sortString(words[i]);
            // If current word is *not* an anagram of the previous included word
            if (!sig.equals(prevSig)) {
                result.add(words[i]);
                prevSig = sig;
            }
        }

        return result;
    }

    // Helper: return a canonical (sorted) form of a string
    private String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
