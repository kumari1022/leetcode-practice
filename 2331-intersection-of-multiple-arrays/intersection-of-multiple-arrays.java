class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> result=new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        } 
        for (int j = 0; j < nums[0].length; j++) {
            set1.add(nums[0][j]);
        }
        for (int i = 1; i < nums.length; i++) {
            HashSet<Integer> set2 = new HashSet<>();

            for (int j = 0; j < nums[i].length; j++) {
                if (set1.contains(nums[i][j])) {
                    set2.add(nums[i][j]);
                }
            }
            set1 = set2;
        }
        for (int val : set1) {
            result.add(val);
        }
        Collections.sort(result);

        return result;

    }
}