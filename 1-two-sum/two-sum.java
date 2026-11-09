class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(hs.containsKey(need)){
                return new int[]{hs.get(need),i};
            }
            hs.put(nums[i],i);
        }
        return new int[]{};
    }
}