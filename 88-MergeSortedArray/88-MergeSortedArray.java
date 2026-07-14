// Last updated: 7/14/2026, 2:12:28 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0;i<n;i++){
        nums1[i+m]=nums2[i];
       }
       Arrays.sort(nums1);
    }
}