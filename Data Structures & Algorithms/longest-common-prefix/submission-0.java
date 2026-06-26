class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
StringBuilder st=new StringBuilder();
        char []first=strs[0].toCharArray();
        char []last=strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
             st.append(first[i]);
        }
        return st.toString();
    }
}