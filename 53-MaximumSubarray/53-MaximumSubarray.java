// Last updated: 14/07/2026, 14:13:53
class Solution {
    public int maxSubArray(int[] a) {
        int c = 0, m = a[0];

        for (int n : a) {
            if (c < 0) c = 0;
            c += n;
            m = Math.max(m, c);
        }

        return m;
    }
}