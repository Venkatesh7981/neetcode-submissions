class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int prod=0;
        int i=0;
        int j=0;
        while(i<=word1.length()-1 && j<=word2.length()-1){
            if(prod==0){
                ans+=word1.charAt(i);
                i++;
                prod=1;
            }
            else{
                ans+=word2.charAt(j);
                j++;
                prod=0;
            }
        }
        while(i<=word1.length()-1){
            ans+=word1.charAt(i);
            i++;
        }
        while(j<=word2.length()-1){
            ans+=word2.charAt(j);
            j++;
        }
        return ans;
    }
}