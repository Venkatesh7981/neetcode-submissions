class Solution {
    public int maxArea(int[] height) {
        int maxwater=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
      while(i<j){

                int wdt=j-i;
                int hig=Math.min(height[j],height[i]);
                int area=wdt*hig;
                maxwater=Math.max(maxwater,area);

            if(height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
            }
         return maxwater;
    }
}