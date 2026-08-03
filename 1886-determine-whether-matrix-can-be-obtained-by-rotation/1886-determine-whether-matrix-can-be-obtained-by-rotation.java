class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int row = mat.length;
        int col = mat[0].length;
        boolean fin = checkMat(mat, target, row, col);
        if(fin) return true;
        for (int rot = 0; rot <= 2; rot++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i != j && j > i) {
                        int temp = mat[i][j];
                        mat[i][j] = mat[j][i];
                        mat[j][i] = temp;
                    }
                }
                int start = 0, end = col - 1;

                while (start < end) {
                    int temp = mat[i][start];
                    mat[i][start] = mat[i][end];
                    mat[i][end] = temp;
                    start++;
                    end--;
                }
            }
            if(checkMat(mat, target, row, col)) return true;
        }
        return false;
    }

    boolean checkMat(int[][] mat, int[][] target, int row, int col) {
        boolean con = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return  true;
    }
}