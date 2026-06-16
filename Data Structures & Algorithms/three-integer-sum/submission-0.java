class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i,j,k;
        HashSet<List<Integer>> map=new HashSet<>();
         
         
        for( i=0;i<nums.length-1;i++){
               j=i+1;
                 k=nums.length-1;
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
           List<Integer> a=new ArrayList<>();
               a.add(nums[i]);
               a.add(nums[j]);
               a.add(nums[k]);
               map.add(a);
               j++;
               k--;
               
            }
            else if(sum>0){
                k--;
            }
            else j++;
        }
    }
        

       return new ArrayList<>(map);
    }
}
