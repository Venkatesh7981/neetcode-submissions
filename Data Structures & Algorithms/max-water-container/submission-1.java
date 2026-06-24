class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int i=0;
       int n=heights.length-1;
        int j=n;
        while(i<j){
            int wdth=j-i;
            int high=Math.min(heights[i],heights[j]);
            int area=wdth*high;
            max=Math.max(max,area);
            if(heights[i]<heights[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return max;
    }
}
