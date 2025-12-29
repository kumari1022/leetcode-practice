import java.util.*;
class Solution{
    public int[] maxSlidingWindow(int[]nums,int k){
        int n=nums.length;
        int[]res=new int[n-k+1];
        Deque<Integer>d=new ArrayDeque<>();
        int idx=0;
        for(int i=0;i<n;i++){
            while(!d.isEmpty()&&d.peekFirst()<=i-k)d.pollFirst();
            while(!d.isEmpty()&&nums[d.peekLast()]<nums[i])d.pollLast();
            d.offerLast(i);
            if(i>=k-1)res[idx++]=nums[d.peekFirst()];
        }
        return res;
    }
}
