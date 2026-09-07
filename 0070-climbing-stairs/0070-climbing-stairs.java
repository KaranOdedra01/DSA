class Solution {
    public int climbStairs(int n) {
     if(n == 1 || n== 0) return 1;

     else{
       int[] st = new int[n+1];

       st[0] = st[1] = 1;

        for(int i= 2;i<=n;i++){
            st[i] = st[i-1] + st[i-2];
        }
        return st[n];
     }   
    }
}