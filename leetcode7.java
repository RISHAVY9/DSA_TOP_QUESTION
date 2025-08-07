
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int lastDigit = x % 10;

            // Check for overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0; // Handle overflow
            }

            rev = rev * 10 + lastDigit;
            x = x / 10;
        }
        return rev;
    }
}
