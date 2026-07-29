// Last updated: 7/29/2026, 10:59:21 AM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3    int zc=0;
4    int m=0;
5    int l=0;
6    for(int r=0;r<nums.length;r++){
7        if(nums[r]==0){
8            zc++;
9        }
10        while(zc>k){
11            if(nums[l]==0){
12               zc--;
13            }
14           l++;
15        }
16        m=Math.max(m,r-l+1);
17    }
18    return m;
19    }
20}