class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int ans[]=new int[nums1.length+nums2.length];
      double mead=0;
      int i=0;
         for(int num:nums1){
            ans[i]=num;
            i++;
         }
         for(int num:nums2){
            ans[i]=num;
            i++;
         }
         Arrays.sort(ans);
         int l=0;
         int r=ans.length-1;
         while(l<r){
            l++;
            r--;
         }
         if(l!=r){
            mead=1.0*(ans[l]+ans[r])/2;
         }
         else {
            return ans[l];
         }

    return mead;
    }
}
