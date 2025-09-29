class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        // dp[i][j] stores the min score to triangulate the polygon defined by vertices values[i]...values[j]
        int[][] dp = new int[n][n]; 

        // l is the length of the diagonal (j - i)
        for (int l = 2; l < n; ++l) { 
            // i is the starting vertex index
            for (int i = 0; i < n - l; ++i) { 
                int j = i + l; // j is the ending vertex index
                dp[i][j] = Integer.MAX_VALUE;
                
                // k is the third vertex of the triangle (i, k, j)
                for (int k = i + 1; k < j; ++k) { 
                    int currentScore = dp[i][k] + dp[k][j] + (values[i] * values[k] * values[j]);
                    dp[i][j] = Math.min(dp[i][j], currentScore);
                }
            }
        }
        
        return dp[0][n - 1];
    }
}
