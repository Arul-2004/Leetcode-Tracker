// Last updated: 7/14/2026, 2:11:52 PM
class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;

        int l = 0, r = n - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
             if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
       return(result);
    }
}
 
    
