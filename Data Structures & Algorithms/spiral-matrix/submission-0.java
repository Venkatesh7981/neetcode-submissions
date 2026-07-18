class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
         ArrayList<Integer> a=new ArrayList<>();
       int n=nums.length;
       int m=nums[0].length;
       int left=0;
       int top=0;
       int right=m-1;
       int bottom=n-1;
       while(left<=right && top<=bottom){
       for(int i=left;i<=right;i++){
        a.add(nums[top][i]);
       }
       top++;
       for(int i=top;i<=bottom;i++){
        a.add(nums[i][right]);
       }
       right--;
       if(top<=bottom){
       for(int i=right;i>=left;i--){
        a.add(nums[bottom][i]);
       }
       bottom--;
       }
       if(left<=right){
       for(int i=bottom;i>=top;i--){
        a.add(nums[i][left]);
       }
       left++;
       }
       }
       return a;
    }
}
