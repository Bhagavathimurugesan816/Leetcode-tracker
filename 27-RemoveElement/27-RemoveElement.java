// Last updated: 14/07/2026, 14:13:58
class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;
        for(int n : nums){
            if(n != val){
                nums[k++] = n;
            }
        }
        return k;
    }
}