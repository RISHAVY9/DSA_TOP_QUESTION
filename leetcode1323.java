class Solution {
    public int maximum69Number(int num) {
        // Convert integer to string for easy digit access
        String s = String.valueOf(num);

        // Replace the first occurrence of '6' with '9'
        String modified = s.replaceFirst("6", "9");

        // Convert modified string back to integer
        return Integer.parseInt(modified);
    }
}
