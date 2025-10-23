class Solution {
    public boolean hasSameDigits(String s) {
        char[] t = s.toCharArray();
        int n = t.length;
        // keep reducing until length becomes 2
        for (int k = n - 1; k > 1; --k) {
            for (int i = 0; i < k; ++i) {
                // sum of current and next digit modulo 10
                t[i] = (char) (((t[i] - '0') + (t[i + 1] - '0')) % 10 + '0');
            }
        }
        return t[0] == t[1];
    }
}
