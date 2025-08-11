https://www.youtube.com/watch?v=96WVYcPZZ8Q&pp=ygUQbGVldGNvZGUgNjkgamF2YQ%3D%3D

class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int left = 0, right = x;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
