//LeetCode #344: Reverse String java solution


https://www.youtube.com/watch?v=KX3q-LuA3QQ&pp=ygUcbGVldGNvZGUgcHJvYmxlbSBpbiBqYXZhIDM0NA%3D%3D

class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while (start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
}
