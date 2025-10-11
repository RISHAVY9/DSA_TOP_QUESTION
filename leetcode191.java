class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);  // turns off the rightmost 1-bit
            count++;
        }
        return count;
    }
}
