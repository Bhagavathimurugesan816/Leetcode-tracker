// Last updated: 14/07/2026, 14:13:36
class Solution {
    public void rotate(int[] nums, int k) {
        int a = nums.length;
         k = k % a;
        int arr[] = new int[a];
        for(int i=0; i<a; i++){
            arr[(i+k) % a] = nums[i];
        }
        for(int i =0; i<a; i++){
            nums[i] = arr[i];
        }
    }
}