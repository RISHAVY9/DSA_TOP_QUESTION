class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; // Carry bits
            a = a ^ b; // Sum without carry
            b = carry; // Carry to be added in next iteration
        }
        return a;
    }
}
