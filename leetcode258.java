https://www.youtube.com/watch?v=gGEWzsYZalM&pp=ygUcbGVldGNvZGUgcHJvYmxlbSBpbiBqYXZhIDI1OA%3D%3D


class Solution {
    public int addDigits(int num) {
        // Special case: 0 remains 0
        if (num == 0) return 0;
        // Digital root via modulo 9
        return (num - 1) % 9 + 1;
    }
}
