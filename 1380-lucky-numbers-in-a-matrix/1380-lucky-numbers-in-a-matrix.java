class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;

            // Find minimum in the row
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            // Check if it is maximum in the column
            boolean lucky = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > min) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) {
                result.add(min);
            }
        }

        return result;
    }
}