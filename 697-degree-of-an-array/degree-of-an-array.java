class Solution{
    public int findShortestSubArray(int[] nums){
        Map<Integer,Integer> left=new HashMap<>();
        Map<Integer,Integer> right=new HashMap<>();
        Map<Integer,Integer> count=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(!left.containsKey(x)) left.put(x,i);
            right.put(x,i);
            count.put(x,count.getOrDefault(x,0)+1);
        }
        int degree=Collections.max(count.values());
        int minLen=n;
        for(int key:count.keySet()){
            if(count.get(key)==degree){
                minLen=Math.min(minLen,right.get(key)-left.get(key)+1);
            }
        }
        return minLen;
    }
}
