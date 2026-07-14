// Last updated: 7/14/2026, 2:11:55 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ws=0;
        for(int i=0;i<k;i++){
            ws=ws+nums[i];
        }
        int ms=ws;
        int avg=0;
        for(int i=k;i<nums.length;i++){
            ws=ws-nums[i-k]+nums[i];
            ms=Math.max(ms,ws);
        }
         return (double)ms/k;
    }
}