class Solution {
    public List<List<Integer>> generate(int n) {
        ArrayList<List<Integer>>ans=new ArrayList<>();
       
        for(int i=0;i<n;i++){
                ArrayList<Integer>a=new ArrayList<>();
                long num=1;
            for(int j=0;j<=i;j++){
             a.add((int)num);
             num=num*(i-j)/(j+1);
            }
            ans.add(a);
        } 
           return ans;
    }
}