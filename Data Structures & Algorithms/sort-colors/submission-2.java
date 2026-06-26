class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        int count1=0,count2=0,count3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count1++;
            }
            else if(nums[i]==1){
                count2++;
            }
            else count3++;
        }
 int ind=0;
 for(int i=0;i<count1;i++){
        nums[ind++]=0;
 }
 for(int i=0;i<count2;i++){
        nums[ind++]=1;
 }for(int i=0;i<count3;i++){
        nums[ind++]=2;
 }

    }
}