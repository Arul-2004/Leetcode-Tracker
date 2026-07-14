// Last updated: 7/14/2026, 2:12:25 PM
class Solution {
    public int singleNumber(int[] nums) {
     int ans=0;
     for(int i :nums)
     ans^=i;
     return ans;   
    }
}