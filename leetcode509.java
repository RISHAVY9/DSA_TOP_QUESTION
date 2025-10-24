class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0;   // F(0)
        int b = 1;   // F(1)
        for (int i = 2; i <= n; i++) {
            int next = a + b;  // F(i) = F(i-2) + F(i-1)
            a = b;             // shift: a becomes F(i-1)
            b = next;          // b becomes F(i)
        }
        return b;
    }
}
