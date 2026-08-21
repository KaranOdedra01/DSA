import java.util.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid-1;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (ans == -1) {
            return new int[] { -1, -1 };
        }
        int[] res = new int[2];
        res[0] = ans;
        low = ans;
        high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        res[1] = ans;

        return res;
    }
}