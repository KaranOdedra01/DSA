class Solution {
    public int smallestNumber(int n, int t) {
        
        int c = 1;
        while (c <= 10) {
            int temp = n,mul = 1;
            while (temp > 0) {
                mul *= temp %10;
                temp /= 10;
            }
            if (mul % t == 0) {
                return n;
            }
            n++;
            c++;
            
        }
        return -1;
    }
}