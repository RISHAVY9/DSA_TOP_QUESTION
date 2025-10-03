import java.util.PriorityQueue;

class Cell implements Comparable<Cell> {
    int row;
    int col;
    int height;

    public Cell(int r, int c, int h) {
        row = r;
        col = c;
        height = h;
    }

    // Min-Heap based on height
    @Override
    public int compareTo(Cell other) {
        return this.height - other.height;
    }
}

class Solution {
    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
            return 0;
        }

        int m = heightMap.length;
        int n = heightMap[0].length;
        PriorityQueue<Cell> minHeap = new PriorityQueue<>();
        boolean[][] visited = new boolean[m][n];
        int totalWater = 0;

        // 1. Initialize the borders (first and last rows/columns)
        // Add left and right columns
        for (int i = 0; i < m; i++) {
            minHeap.offer(new Cell(i, 0, heightMap[i][0]));
            visited[i][0] = true;

            minHeap.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
            visited[i][n - 1] = true;
        }

        // Add top and bottom rows (excluding the corners already added)
        for (int j = 1; j < n - 1; j++) {
            minHeap.offer(new Cell(0, j, heightMap[0][j]));
            visited[0][j] = true;

            minHeap.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
            visited[m - 1][j] = true;
        }

        // Directions for checking neighbors (Up, Down, Left, Right)
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        // 2. BFS from the shortest boundary wall inwards
        while (!minHeap.isEmpty()) {
            Cell current = minHeap.poll();
            int currentWallHeight = current.height;

            // Check all 4 neighbors
            for (int[] dir : dirs) {
                int nextR = current.row + dir[0];
                int nextC = current.col + dir[1];

                // Check bounds and if already visited
                if (nextR >= 0 && nextR < m && nextC >= 0 && nextC < n && !visited[nextR][nextC]) {
                    visited[nextR][nextC] = true;
                    int neighborHeight = heightMap[nextR][nextC];

                    // Water can be trapped if the cell height is less than the shortest surrounding wall height
                    if (neighborHeight < currentWallHeight) {
                        totalWater += currentWallHeight - neighborHeight;
                        // The new effective wall height for this cell is the currentWallHeight
                        minHeap.offer(new Cell(nextR, nextC, currentWallHeight));
                    } else {
                        // If the neighbor is taller or equal, it becomes the new wall
                        minHeap.offer(new Cell(nextR, nextC, neighborHeight));
                    }
                }
            }
        }

        return totalWater;
    }
}
