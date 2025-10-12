class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // array to count letters in magazine
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        // try to “use up” letters for ransom note
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false;
            }
            freq[c - 'a']--;
        }
        return true;
    }
}
