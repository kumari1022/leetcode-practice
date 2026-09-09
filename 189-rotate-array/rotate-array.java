class Solution {
    public void rotate(int[] nums, int k) {
       int j=nums.length-1; 
       for(int i=0;i<nums.length;i++){
         if(i>=j){
            break;
         }
         int temp=nums[i];
         nums[i]=nums[j];
         nums[j]=temp;
         j--;
       }
       int p=k%nums.length-1;
       for(int i=0;i<k%nums.length;i++){
        if(i>=p){
            break;
        }
        int tmp=nums[i];
        nums[i]=nums[p];
        nums[p]=tmp;
        p--;
       }
       int l=nums.length-1; 
       for(int i=k%nums.length;i<nums.length;i++){
        if(i>=l){
            break;
        }
        int tmp=nums[i];
        nums[i]=nums[l];
        nums[l]=tmp;
        l--;
       } 
       
    }
}