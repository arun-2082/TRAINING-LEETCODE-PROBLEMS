class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] R = new boolean[m];
        boolean[] C = new boolean[n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matrix[i][j] == 0) {
                    R[i] = true;
                    C[j] = true;
                }
            }
        }
        for (int i=0; i<m; i++) {
            if (R[i]) {
                for (int j=0; j<n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j=0; j<n; j++) {
            if (C[j]) {
                for (int i=0; i<m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
    
}
