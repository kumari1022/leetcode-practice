class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int m=n-k;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+cardPoints[i];
        }
        int sum1=0;
        for(int i=0;i<m;i++){
            sum1=sum1+cardPoints[i];
        }
        int min=sum1;
        int j=0;
        for(int i=m;i<n;i++){
            sum1=sum1-cardPoints[j++]+cardPoints[i];
            min=Math.min(sum1,min);

        }
        return sum-min;
        
    }
}