class Solution {
    public String addStrings(String num1, String num2) {
        // Use StringBuilder to build result in reverse order, then reverse it at the end
        StringBuilder sb = new StringBuilder();
        
        int carry = 0;
        int i = num1.length() - 1;  // pointer for num1 from least significant digit
        int j = num2.length() - 1;  // pointer for num2

        // Loop until both strings are exhausted *and* there is no carry left
        while (i >= 0 || j >= 0 || carry != 0) {
            // If there is still a digit in num1, add it to carry
            if (i >= 0) {
                carry += num1.charAt(i) - '0';
                i--;
            }
            // If there is still a digit in num2, add it
            if (j >= 0) {
                carry += num2.charAt(j) - '0';
                j--;
            }
            // The current result digit is carry % 10
            int digit = carry % 10;
            sb.append(digit);
            // Update carry for next position
            carry /= 10;
        }

        // Since we built the number from least significant → most, reverse the StringBuilder
        return sb.reverse().toString();
    }
}
