class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // Step 1: Create a boolean array for fast lookup
        boolean[] broken = new boolean[26];
        for (char c : brokenLetters.toCharArray()) {
            broken[c - 'a'] = true;
        }

        // Step 2: Split the text into words
        String[] words = text.split(" ");
        int count = 0;

        // Step 3 & 4: Check each word and count typeable ones
        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (broken[c - 'a']) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }
        return count;
    }
}
