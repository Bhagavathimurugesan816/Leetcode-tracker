// Last updated: 14/07/2026, 14:14:08
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int nums[] = new int[m+n];
        int k =0;
        for(int num:nums1)
        nums[k++] = num;
        for(int num:nums2)
        nums[k++] = num;

        Arrays.sort(nums);

        int a = nums.length;

        if(a % 2 != 0){
             return nums[a / 2];
        } 
        else {
            return (nums[a / 2 - 1] + nums[a / 2]) / 2.0;
        }

    }
}