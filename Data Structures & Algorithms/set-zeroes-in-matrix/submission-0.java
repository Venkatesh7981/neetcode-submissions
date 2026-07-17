class Solution {
    public void setZeroes(int[][] nums) {
        int r=nums.length;
       int c=nums[0].length;
       boolean row[]=new boolean[r];
       boolean col[]=new boolean[c];
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(nums[i][j]==0){
                row[i]=true;
                col[j]=true;
            }
        }
       }
        for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
          if(row[i] || col[j]){
            nums[i][j]=0;
             }
            }
          }
    }
}
