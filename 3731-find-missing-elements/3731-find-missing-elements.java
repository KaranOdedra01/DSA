class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = 0;
        boolean[] freq = new boolean[101];
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            freq[nums[i]] = true;
            min = Math.min(min,nums[i]);
        }
        for(int i = min;i<max;i++){
            if(!freq[i]){
                res.add(i);
            }
        }
        return res;
    }
}