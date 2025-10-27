class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        // If there are no operations, all cells are maximum (zero increments)
        if (ops == null || ops.length == 0) {
            return m * n;
        }
        
        int minA = m;
        int minB = n;
        for (int[] op : ops) {
            // op[0] is a, op[1] is b
            if (op[0] < minA) {
                minA = op[0];
            }
            if (op[1] < minB) {
                minB = op[1];
            }
        }
        
        // The intersection region has size minA * minB
        return minA * minB;
    }
}
