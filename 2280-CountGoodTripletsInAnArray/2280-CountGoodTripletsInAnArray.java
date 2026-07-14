// Last updated: 14/07/2026, 14:13:10
class Solution {

    public long goodTriplets(int[] nums1, int[] nums2) {

        int n = nums1.length;

        int[] pos = new int[n];

        for (int i = 0; i < n; i++)
            pos[nums1[i]] = i;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = pos[nums2[i]];

        BIT bit = new BIT(n);

        long[] left = new long[n];

        for (int i = 0; i < n; i++) {
            left[i] = bit.sum(arr[i]);
            bit.add(arr[i] + 1, 1);
        }

        bit = new BIT(n);

        long ans = 0;

        for (int i = n - 1; i >= 0; i--) {

            long right =
                bit.sum(n) - bit.sum(arr[i] + 1);

            ans += left[i] * right;

            bit.add(arr[i] + 1, 1);
        }

        return ans;
    }

    class BIT {

        int[] t;

        BIT(int n) {
            t = new int[n + 2];
        }

        void add(int i, int v) {
            while (i < t.length) {
                t[i] += v;
                i += i & -i;
            }
        }

        long sum(int i) {
            long s = 0;
            while (i > 0) {
                s += t[i];
                i -= i & -i;
            }
            return s;
        }
    }
}