class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (!values.containsKey(target-nums[i])) {
                values.put(nums[i], i);
            }
            else {
                indices[0]=values.get(target-nums[i]);
                indices[1]=i;
            }
        }
        return indices;
    }
}