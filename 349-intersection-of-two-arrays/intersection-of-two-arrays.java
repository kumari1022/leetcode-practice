class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hm1=new HashSet<>();
        HashSet<Integer> hm2=new HashSet<>();
        int j=0;
        for(int i=0;i<nums1.length;i++){
              hm1.add(nums1[i]);

        }
        for(int i=0;i<nums2.length;i++){
            if(hm1.contains(nums2[i])){
                hm2.add(nums2[i]);
            }
        }
        int[] arr=new int[hm2.size()];
        for(int i : hm2){
            arr[j]=i;
            j++;
        }
        return arr;
        
    }
}