class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(nums[i])) {
                return true;
            }
            else {
                values.put(nums[i], 1);
            }
        }
        return false;
    }
}