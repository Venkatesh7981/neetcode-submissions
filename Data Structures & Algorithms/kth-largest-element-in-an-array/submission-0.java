class Solution {
    public int findKthLargest(int[] nums, int k) {
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
            int ind=nums.length-k;
            return nums[ind];
      }
       return -1;  
    }
   
}
