LINK = https://www.youtube.com/watch?v=to4Ufp0MU4w


public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long reversed = 0;
        int temp = x;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
            // Overflow safety
            if (reversed > Integer.MAX_VALUE) {
                return false;
            }
        }
        return reversed == x;
    }
}
