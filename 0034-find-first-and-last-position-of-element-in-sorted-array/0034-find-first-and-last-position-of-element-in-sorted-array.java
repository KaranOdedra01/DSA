import java.util.*;

class Solution {
    int binary(int[] nums,int target,boolean occur){

        int low = 0;
        int high = nums.length - 1;

        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                if(occur){
                high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;

    }

    public int[] searchRange(int[] nums, int target) {

            int first = binary(nums,target,true);
            int second = binary(nums,target,false);
            return new int[] {first,second};
        
    }
}