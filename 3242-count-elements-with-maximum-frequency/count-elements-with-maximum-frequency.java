class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxcount=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curr=hs.getOrDefault(nums[i],0)+1;
            hs.put(nums[i],curr);
            if(curr>maxcount){
                maxcount=curr;
            }
            
        }
        int total=0;
        for(int frq:hs.values()){
            if(frq==maxcount){
                total=total+frq;
            }
        }
        return total;
    }
}