class Solution {
    public String triangleType(int[] nums) {
        // There are exactly 3 sides
        int a = nums[0], b = nums[1], c = nums[2];
        
        // Check triangle inequality: sum of any two sides > the third
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }
        
        // Now it's a valid triangle — classify
        if (a == b && b == c) {
            return "equilateral";
        }
        else if (a == b || b == c || a == c) {
            return "isosceles";
        }
        else {
            return "scalene";
        }
    }
}
