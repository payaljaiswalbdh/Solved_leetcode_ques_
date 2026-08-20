class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;       
        int m = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;
        //  row contains zero
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }
    //   column contains zero
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

         // Mark rows and columns using first row/column
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
         // Make rows zero
        for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j] = 0;
            
            }
        }

    // First row
        if (firstRow) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // First column
        if (firstCol) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
