https://youtu.be/cNakvqTDENM

class Solution {
    public int compress(char[] chars) {
        int write = 0;
        for (int i = 0; i < chars.length; ) {
            char currentChar = chars[i];
            int count = 0;
            // Count the number of repeats of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            // Write the character itself
            chars[write++] = currentChar;
            // If there are multiple occurrences, write the count as digits
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}


