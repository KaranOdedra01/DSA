class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxc = 0;
        int c =0;

        for(int n:nums){
            if(n == 1){
                c++;
            }
            else{

            maxc = Math.max(c,maxc);
            c = 0; 
            }
        }
        return maxc > c ? maxc : c;
       
    }
}