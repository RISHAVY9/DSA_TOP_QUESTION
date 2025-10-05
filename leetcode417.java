import java.util.ArrayList;
import java.util.List;

class Solution {
    private int rows;
    private int cols;
    private int[][] heights;
    private final int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }

        this.rows = heights.length;
        this.cols = heights[0].length;
        this.heights = heights;

        // Tracks cells reachable from Pacific (top and left borders)
        boolean[][] pacific = new boolean[rows][cols];
        // Tracks cells reachable from Atlantic (bottom and right borders)
        boolean[][] atlantic = new boolean[rows][cols];

        // 1. DFS from Pacific borders (top row and left column)
        for (int i = 0; i < rows; i++) {
            dfs(i, 0, pacific); // Left column
        }
        for (int j = 0; j < cols; j++) {
            dfs(0, j, pacific); // Top row
        }

        // 2. DFS from Atlantic borders (bottom row and right column)
        for (int i = 0; i < rows; i++) {
            dfs(i, cols - 1, atlantic); // Right column
        }
        for (int j = 0; j < cols; j++) {
            dfs(rows - 1, j, atlantic); // Bottom row
        }

        // 3. Collect the common cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    // This cell can flow to both oceans
                    result.add(List.of(i, j));
                }
            }
        }

        return result;
    }

    /**
     * DFS function to mark all cells that can flow *into* (or reach) a specific ocean.
     * The condition for reverse flow is heights[next_r][next_c] >= heights[r][c].
     */
    private void dfs(int r, int c, boolean[][] visited) {
        if (visited[r][c]) {
            return;
        }

        visited[r][c] = true;

        for (int[] dir : directions) {
            int newR = r + dir[0];
            int newC = c + dir[1];

            // Check bounds
            if (newR < 0 || newR >= rows || newC < 0 || newC >= cols) {
                continue;
            }

            // Check the "uphill" flow condition
            // The water must come from a cell with height >= current cell's height
            if (heights[newR][newC] >= heights[r][c]) {
                dfs(newR, newC, visited);
            }
        }
    }
}
