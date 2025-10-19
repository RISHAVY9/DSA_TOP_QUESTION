class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        final char[] hexChars = {
            '0','1','2','3','4','5','6','7',
            '8','9','a','b','c','d','e','f'
        };
        StringBuilder sb = new StringBuilder();
        // Use unsigned right-shift >>> to correctly handle negative numbers
        while (num != 0) {
            int hexDigit = num & 0xF;      // extract lowest 4 bits
            sb.append(hexChars[hexDigit]); // map 0–15 to hex char
            num = num >>> 4;               // shift right 4 bits, zero-fill
        }
        return sb.reverse().toString();
    }
}
