class Solution {
    public int removeElement(int[] nums, int val) {
        // HashMap<Integer,Integer> map=new HashMap<>();

        // for(int num:nums){
        //     if(map.containsKey(val)){
        //         continue;
        //     }
        //     map.put(num,1);
        // }
        // return map.get()
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
               nums[k]=nums[i];
               k++;
            }
        }
        return k;
    }
}