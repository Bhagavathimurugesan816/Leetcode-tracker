// Last updated: 14/07/2026, 14:13:22
class Solution {
    public int findDuplicate(int[] nums) {
        int a = nums[0];
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
               a = nums[i];
            }
        }
        return a;
    } 
}