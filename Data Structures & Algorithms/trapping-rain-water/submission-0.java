class Solution {
    public int trap(int[] height) {
        int ans=0;
        int l=0;
        int n=height.length-1;
        int r=n;
        int lm=0;
        int rm=0;

       while(l<r){
            lm=Math.max(lm,height[l]);
            rm=Math.max(rm,height[r]);
            int min=Math.min(lm,rm);
            if(height[l]<height[r]){
                ans+=min-height[l];
                l++;
            }
            else {
                 ans+=min-height[r];
                r--;
            }
       }
       return ans;
    }
}