// Last updated: 9/2/2026, 2:33:32 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int c=nums[0];
4        int m=nums[0];
5        for(int i=1;i<nums.length;i++){
6            c=Math.max(nums[i],(nums[i]+c));
7            m=Math.max(c,m);
8        }
9        return m;
10    }
11}