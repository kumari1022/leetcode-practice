class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] freq=new char[26];
        for(char c : magazine.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(freq[c-'a']==0){
                return false;
            }
            freq[c-'a']--;
        }
        return true;
    }
}