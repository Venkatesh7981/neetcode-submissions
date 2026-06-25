class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String st:strs){
            char []ch=st.toCharArray();
            Arrays.sort(ch);
            String sortarr=new String(ch);
            map.putIfAbsent(sortarr,new ArrayList<>());
            map.get(sortarr).add(st);
        }
        return new ArrayList<>(map.values());
    }
}
