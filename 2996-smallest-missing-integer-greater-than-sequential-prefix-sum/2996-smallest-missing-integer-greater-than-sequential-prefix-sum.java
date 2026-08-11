class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(nums[i] == (nums[i-1] + 1)) sum += nums[i]; 
            else break;
        }
        Set<Integer> res = new HashSet<>();

        for(int i:nums){
            if(i>=sum){
                res.add(i);
            }
        }

        while(res.contains(sum)){
            sum++;
        }
        return sum;
    }
}