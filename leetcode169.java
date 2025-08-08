https://www.youtube.com/watch?v=1r8kzrXJiUk&pp=ygUcbGVldGNvZGUgcHJvYmxlbSBpbiBqYXZhIDE2OQ%3D%3D


class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
