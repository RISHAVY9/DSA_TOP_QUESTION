class Solution {
    public int differenceOfSums(int n, int m) {
        // 1. Calculate the total sum of all integers from 1 to n
        // Using long to prevent overflow before casting back to int, 
        // although for the constraints (n <= 1000), int is sufficient.
        int totalSum = n * (n + 1) / 2;
        
        // 2. Determine the largest multiple of m that is <= n
        int k = n / m; 
        
        // 3. Calculate the sum of integers divisible by m (num2)
        // This is m * (1 + 2 + ... + k)
        int num2 = m * (k * (k + 1) / 2);
        
        // 4. Calculate num1 - num2:
        // num1 - num2 = (totalSum - num2) - num2 = totalSum - 2 * num2
        int result = totalSum - 2 * num2;
        
        return result;
    }
}
