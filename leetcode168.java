class Solution {
    public String convertToTitle(int n) {
        // Base case: when n becomes 0, return empty string
        if (n == 0) {
            return "";
        }
        // Recurse on the “higher-order” part
        int prev = (n - 1) / 26;
        char lastChar = (char) ('A' + (n - 1) % 26);
        return convertToTitle(prev) + lastChar;
    }
}
