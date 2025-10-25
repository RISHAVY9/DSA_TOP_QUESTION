class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int remainder = n % 7;

        // sum of one week when it starts at 1: 1+2+…+7 = 28
        int firstWeekSum = 28;

        // sum of the last full week (starts at 1 + (weeks-1))
        // Last full week sum = trapezoid(start, start+6)
        // where start = 1 + (weeks-1)
        int lastFullWeekStart = 1 + (weeks - 1);
        int lastFullWeekSum = trapezoid(lastFullWeekStart, lastFullWeekStart + 6);

        // total from all full weeks
        // number of terms = weeks, arithmetic series from firstWeekSum to lastFullWeekSum
        int totalFullWeeks = (firstWeekSum + lastFullWeekSum) * weeks / 2;

        // Now the partial week: it starts at 1 + weeks
        int partialWeekStart = 1 + weeks;
        int partialWeekEnd = partialWeekStart + remainder - 1;
        int totalPartial = trapezoid(partialWeekStart, partialWeekEnd);

        return totalFullWeeks + totalPartial;
    }

    // helper: sum of integers from a to b inclusive
    private int trapezoid(int a, int b) {
        return (a + b) * (b - a + 1) / 2;
    }
}
