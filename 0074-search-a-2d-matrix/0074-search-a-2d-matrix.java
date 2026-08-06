class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int olow = 0;
        int ohigh = n - 1;
        while (olow <= ohigh) {
            int omid = olow + (ohigh - olow) / 2;
            
            // Fix 1: Use m - 1 instead of n - 1 to check the end of the current row
            if (matrix[omid][0] <= target && matrix[omid][m - 1] >= target) {
                
                int low = 0;
                // Fix 2: Use m - 1 instead of n - 1 for the column high bound
                int high = m - 1; 
                
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (matrix[omid][mid] == target) {
                        return true;
                    } else if (matrix[omid][mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                // Fix 3: Moved return false outside the inner while loop
                return false; 
                
            } else if (matrix[omid][0] > target) {
                ohigh = omid - 1;
            } else {
                olow = omid + 1;
            }
        }
        return false;
    }
}