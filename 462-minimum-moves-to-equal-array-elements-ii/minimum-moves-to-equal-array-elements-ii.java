import java.util.*;

class Solution{
    public int minMoves2(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        int m=nums[n/2];
        long s=0;
        for(int i=0;i<n;i++){
            s+=Math.abs(nums[i]-m);
        }
        return (int)s;
    }
}
