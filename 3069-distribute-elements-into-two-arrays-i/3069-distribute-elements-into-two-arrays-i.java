class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int count1 = 0;
        int count2 = 0;
        arr1[count1] = nums[0];
        count1++;
        arr2[count2] = nums[1];
        count2++;

        for(int i = 2;i<nums.length;i++){
            if(arr1[count1 - 1]  > arr2[count2 - 1]){
                arr1[count1] = nums[i];
                count1++;
            }
            else{
                arr2[count2] = nums[i];
                count2++;
            }
        } 

       int[] res = new int[n];
        for (int i = 0; i < count1; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < count2; i++) {
            res[count1 + i] = arr2[i];
        }
        return res;
    }
}