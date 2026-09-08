class Solution {
    public int missingNumber(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
             k=k+nums[i];
        }
        int p=(nums.length*(nums.length+1))/2;
        return p-k;
    }
}