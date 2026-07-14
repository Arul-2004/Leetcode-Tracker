// Last updated: 7/14/2026, 2:12:15 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int s=0;
        int min=Integer.MAX_VALUE;
        for(r= 0;r<nums.length;r++){
         s=nums[r]+s;
         while(s>=target){
          min=Math.min(min,r-l+1);
          s=s-nums[l];
          l++;
         }

        }
        if(min==Integer.MAX_VALUE){
        return 0;
    }
         return min;
    }
}  
   