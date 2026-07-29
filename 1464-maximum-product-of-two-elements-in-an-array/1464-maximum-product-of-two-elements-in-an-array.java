class Solution {
    public int maxProduct(int[] nums) {
      int max = Integer.MIN_VALUE;
      int sec_max = Integer.MIN_VALUE;
      for(int i = 0;i<nums.length;i++){
        if(max < nums[i]){
            sec_max = max;
            max = nums[i];
        }
        else if(sec_max < nums[i]) sec_max = nums[i];
      }  
      return ((sec_max - 1) * (max - 1));
    }
}