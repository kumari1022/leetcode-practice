class Solution {
    public void reverseString(char[] s) {
       int n=s.length;
        int i=0,j=n-1;
        while(i<j){
            char k=s[i];
            s[i]=s[j];
            s[j]=k;
            i++;
            j--;
        }

        for(int m=0;m<n;m++){
            System.out.println(s[m]);
        }
    }
}