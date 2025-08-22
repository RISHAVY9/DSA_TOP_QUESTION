https://youtu.be/vkxUVdGgnhU

class Solution {
    public String largestOddNumber(String num) {
        // Traverse the string from end to start
        for (int i = num.length() - 1; i >= 0; --i) {
            // Check if current digit is odd
            if ((num.charAt(i) - '0') % 2 != 0) {
                // Return substring [0, i], inclusive
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit was found, return empty string
        return "";
    }
}
