// Last updated: 14/07/2026, 14:13:16
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxc=0;

        for(int i=0;i<=nums.length-1;i++) {
            if(nums[i]==1)
              count++;
              else 
              count=0;
              if(count>maxc) 
              maxc = count;
 }
              return maxc;
       
  }
}
