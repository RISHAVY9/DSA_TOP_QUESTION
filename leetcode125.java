class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer forward if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer backward if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare characters in lowercase for case-insensitive check
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
