https://www.youtube.com/watch?v=-cOyoXW73-I&pp=ygURNDQxIGxlZXRjb2RlIGphdmE%3D
class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n;
        while (left <= right) {
            long mid = (left + right) / 2;
            long coinsNeeded = mid * (mid + 1) / 2;
            if (coinsNeeded == n) {
                return (int) mid;
            } else if (coinsNeeded < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }
}
