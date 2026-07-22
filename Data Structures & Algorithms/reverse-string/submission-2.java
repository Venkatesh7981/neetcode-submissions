class Solution {
    public void reverseString(char[] s) {
        
        int i=0;
        int j=s.length-1;
        while(i<j){
            s[i]^=(char)(s[j]);
            s[j]^=(char)(s[i]);
            s[i]^=(char)(s[j]);
            i++;
            j--;
        }
    }
}