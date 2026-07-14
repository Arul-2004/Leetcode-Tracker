// Last updated: 7/14/2026, 2:12:08 PM
class Solution {
    public int minPatches(int[] nums, int n) {

        long miss = 1;
        int i = 0;
        int patches = 0;

        while (miss <= n) {

            if (i < nums.length && nums[i] <= miss) {

                miss = miss + nums[i];
                i++;

            } else {

                miss = miss + miss;
                patches++;
            }
        }

        return patches;
    }
}