class Solution {
    public int compress(char[] chars) {
        int i=0;
        int w=0;
        while(i<chars.length){
            char curr=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==curr){
                count++;
                i++;
            }
            chars[w]=curr;
            w++;
            if(count>1){
                String num=String.valueOf(count);
                for(int j=0;j<num.length();j++){
                    chars[w]=num.charAt(j);
                    w++;
                }

            }

        }
        return w;
        
    }
}