// Last updated: 14/07/2026, 14:13:50
class Solution {
    public int[] plusOne(int[] a) {

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < 9) {
                a[i]++;
                return a;
            }
            a[i] = 0;
        }

        int[] r = new int[a.length + 1];
        r[0] = 1;
        return r;
    }
}