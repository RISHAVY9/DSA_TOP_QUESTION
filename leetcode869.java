
https://youtu.be/PBf1qzkN6z8


class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] count = countDigits(n);
        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(count, countDigits(1 << i))) {
                return true;
            }
        }
        return false;
    }

    private int[] countDigits(int x) {
        int[] freq = new int[10];
        while (x > 0) {
            freq[x % 10]++;
            x /= 10;
        }
        return freq;
    }
}
