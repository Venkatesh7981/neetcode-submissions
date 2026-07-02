class Solution {
    public int maxSubArray(int[] nums) {
      int ans=nums[0];
      int dp[]=new int[nums.length];
      dp[0]=nums[0];
      for(int i=1;i<=dp.length-1;i++){
        dp[i]=(dp[i-1]+nums[i]>nums[i])?dp[i-1]+nums[i]:nums[i];
        ans=(ans>dp[i]?ans:dp[i]);
      }  
      return ans;
    }
}
