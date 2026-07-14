// Last updated: 7/14/2026, 2:11:41 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {
      int n=nums.length;
      int []r=new int[2*n];
        for(int i = 0; i < n; i++) {
            r[i] = nums[i];
            r[2*n - 1 - i] = nums[i];
        }

        return r;
    }
}