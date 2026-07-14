// Last updated: 14/07/2026, 14:13:25
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int expected = n * (n + 1) / 2;

        int actual = 0;
        for (int num : nums) {
            actual += num;
        }

        return expected - actual;
    }
}