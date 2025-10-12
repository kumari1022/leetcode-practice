class Solution{
    public int getLengthOfOptimalCompression(String s,int k){
        int n=s.length();
        Integer[][] dp=new Integer[n+1][k+1];
        return dfs(s,0,k,dp);
    }
    private int dfs(String s,int i,int k,Integer[][] dp){
        if(k<0)return 101;
        if(i>=s.length()||s.length()-i<=k)return 0;
        if(dp[i][k]!=null)return dp[i][k];
        int res=dfs(s,i+1,k-1,dp);
        int same=0,diff=0;
        for(int j=i;j<s.length()&&diff<=k;j++){
            if(s.charAt(j)==s.charAt(i))same++;
            else diff++;
            res=Math.min(res,len(same)+dfs(s,j+1,k-diff,dp));
        }
        return dp[i][k]=res;
    }
    private int len(int c){
        if(c==1)return 1;
        if(c<10)return 2;
        if(c<100)return 3;
        return 4;
    }
}
