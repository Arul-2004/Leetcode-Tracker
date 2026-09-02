// Last updated: 9/2/2026, 2:58:00 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int k = 0;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] != 0) {
6                nums[k] = nums[i];
7                k++;
8            }
9        }
10        while (k < nums.length) {
11            nums[k] = 0;
12            k++;
13        }
14    }
15}