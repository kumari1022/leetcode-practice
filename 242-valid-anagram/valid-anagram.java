class Solution {
    public boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<ch1.length;i++){
            hm.put(ch1[i],hm.getOrDefault(ch1[i],0)+1);
        }
        for(int i=0;i<ch2.length;i++){
            if (!hm.containsKey(ch2[i])) {
                return false; 
            }
            hm.put(ch2[i], hm.get(ch2[i]) - 1);
            if (hm.get(ch2[i]) < 0) {
                return false; 
            }
        }
        Set<Character> st = hm.keySet();
        for(Character i : st){
            if(hm.get(i)!=0)
                return false;
        }
        return true;
    }
}