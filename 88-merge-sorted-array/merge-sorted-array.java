class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = nums1.length - 1;

        for (int i = k; i >= m; i--) {

            if (n == 0) {
                break;
            }

            nums1[i] = nums2[n - 1];
            n--;
        }

        Arrays.sort(nums1);
    }
}