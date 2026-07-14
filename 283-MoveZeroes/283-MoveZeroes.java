// Last updated: 14/07/2026, 14:13:23
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0; 
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}