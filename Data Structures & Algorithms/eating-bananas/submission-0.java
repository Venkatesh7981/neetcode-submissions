class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int max=Integer.MIN_VALUE;
         for(int num:piles){
        max=Math.max(max,num);
        }
        int j=max;
        int ans=max;
       
        while(i<=j){
            int mid=i+(j-i)/2;
            long time=0;
            for(int p:piles){
                time+=Math.ceil((double)p/mid);
            }
            if(time<=h){
                j=mid-1;
                ans=mid;
            }
            else {
                i=mid+1;
            }
        }
        return ans;
    }
}
