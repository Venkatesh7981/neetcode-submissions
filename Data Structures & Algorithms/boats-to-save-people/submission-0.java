class Solution {
    public int numRescueBoats(int[] nums, int limit) {
    int count=0;
    Arrays.sort(nums);
    int i=0;
    int j=nums.length-1;
   while(i<=j){
    int sum=nums[i]+nums[j];
        if(sum<=limit){
            count++;
            i++;
            j--;
        }
      else {
            count++;
            j--;
        }
      } 
      return count;
    }
}