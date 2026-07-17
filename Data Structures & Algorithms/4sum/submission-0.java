class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        if(nums.length<4) 
        return new ArrayList<>(set);  
        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int l=j+1;
                int r=nums.length-1;
            while(l<r){
                long sum=(long)nums[i]+nums[j]+nums[r]+nums[l];
                if(sum==target){
                    ArrayList<Integer> a=new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[r]);
                    a.add(nums[l]);
                    set.add(a);
                    l++;
                    r--;
                   
                }
                else if(sum>target){
                    r--;
                }
                else l++;
            }
          }
        }
    
        return new ArrayList<>(set);
    }
}