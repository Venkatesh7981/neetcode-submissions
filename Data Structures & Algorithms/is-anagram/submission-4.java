class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
       
        for(char num:s1){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(char num:t1){
            map2.put(num,map2.getOrDefault(num,0)+1);
             
        }
        if(map1.size()!=map2.size())
         return false;
        for(char i:map1.keySet()){
            if(! map2.containsKey(i)){
                return false;
            }
            else if(!map1.get(i).equals(map2.get(i))){
                return false;
            }
        }

        return true;
    }
}
