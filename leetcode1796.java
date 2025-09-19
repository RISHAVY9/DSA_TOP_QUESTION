class Solution {
    public int secondHighest(String s) {
        int maxDigit = -1;
        int secondMaxDigit = -1;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int d = c - '0';
                
                if (d > maxDigit) {
                    // new highest: bump down old max to second max
                    secondMaxDigit = maxDigit;
                    maxDigit = d;
                } else if (d < maxDigit && d > secondMaxDigit) {
                    // d is between max and secondMax, so update secondMax
                    secondMaxDigit = d;
                }
            }
        }
        
        return secondMaxDigit;
    }
}
