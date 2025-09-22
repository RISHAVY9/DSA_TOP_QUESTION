class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Since constraints say nums[i] are positive and <= 100
        // we can use a fixed-size array for counts
        int MAX = 100;
        int[] count = new int[MAX + 1];
        
        // Count frequencies
        for (int x : nums) {
            count[x]++;
        }
        
        // Find the maximum frequency
        int maxFreq = 0;
        for (int freq : count) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }
        
        // Sum frequencies of all elements having freq == maxFreq
        int result = 0;
        for (int freq : count) {
            if (freq == maxFreq) {
                result += freq;
            }
        }
        
        return result;
    }
}
