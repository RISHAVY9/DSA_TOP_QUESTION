class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;  // 1 is a proper divisor of any number > 1
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                sum += i;
                int other = num / i;
                if (other != i) {
                    sum += other;
                }
            }
        }
        return sum == num;
    }
}
