// Last updated: 7/14/2026, 2:11:36 PM
class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;

        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[nums2[i]] = i;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = pos[nums1[i]];
        }

        long[] left = new long[n];
        long[] right = new long[n];

        int[] bit = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i] = getSum(bit, arr[i]);
            update(bit, arr[i] + 1, 1);
        }

        bit = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            right[i] = getSum(bit, n) - getSum(bit, arr[i] + 1);
            update(bit, arr[i] + 1, 1);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += left[i] * right[i];
        }

        return ans;
    }

    private void update(int[] bit, int idx, int val) {
        while (idx < bit.length) {
            bit[idx] += val;
            idx += idx & -idx;
        }
    }

    private int getSum(int[] bit, int idx) {
        int sum = 0;
        while (idx > 0) {
            sum += bit[idx];
            idx -= idx & -idx;
        }
        return sum;
    }
}