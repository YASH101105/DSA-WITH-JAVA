class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
           
            int minColIdx = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][minColIdx]) {
                    minColIdx = j;
                }
            }
            int rowMin = matrix[i][minColIdx];

            boolean isMaxInCol = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][minColIdx] > rowMin) {
                    isMaxInCol = false;
                    break;
                }
            }
            if (isMaxInCol) {
                result.add(rowMin);
            }
        }

        return result;
    }
}