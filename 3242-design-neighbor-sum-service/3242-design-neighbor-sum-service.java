class NeighborSum {
    int[][] grid;
    int n;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
    }

    public int adjacentSum(int value) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    if (i > 0) sum += grid[i - 1][j];
                    if (i < n - 1) sum += grid[i + 1][j];
                    if (j > 0) sum += grid[i][j - 1];
                    if (j < n - 1) sum += grid[i][j + 1];

                    return sum;
                }
            }
        }

        return sum;
    }

    public int diagonalSum(int value) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    if (i > 0 && j > 0)
                        sum += grid[i - 1][j - 1];

                    if (i > 0 && j < n - 1)
                        sum += grid[i - 1][j + 1];

                    if (i < n - 1 && j > 0)
                        sum += grid[i + 1][j - 1];

                    if (i < n - 1 && j < n - 1)
                        sum += grid[i + 1][j + 1];

                    return sum;
                }
            }
        }

        return sum;
    }
}