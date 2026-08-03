class Solution {
    public int maxSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < r-2; i++){
            for(int j = 0; j < c-2; j++){
                sum = 0;
                for(int k = 0; k <= 2; k++){
                    if(k == 1) sum += grid[i+1][j+1];
                    else{
                        for(int l = 0; l <= 2; l++){
                            sum += grid[i+k][j+l];
                        }
                    }
                }
                if(max < sum) max = sum;
            }
        }
        return max;
    }
}