class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hs=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hs.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}