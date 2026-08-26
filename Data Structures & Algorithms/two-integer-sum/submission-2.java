class Solution {
    int[] ans = new int[2];

    public int[] twoSum(int[] nums, int target) {
        helper(0, nums, target);
        return ans;
    }

    void helper(int i, int[] nums, int target) {

        if (i >= nums.length - 1) {
            return;
        }

        for (int j = i + 1; j < nums.length; j++) {

            if (nums[i] + nums[j] == target) {
                ans[0] = i;
                ans[1] = j;
                return;
            }
        }

        helper(i + 1, nums, target);
    }
}