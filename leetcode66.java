
https://www.youtube.com/watch?v=iBk_JyxxuN8



class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry needed—return immediately
            }
            digits[i] = 0; // Change 9 to 0 and continue carry
        }
        // All digits were 9, so we need a bigger array
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
