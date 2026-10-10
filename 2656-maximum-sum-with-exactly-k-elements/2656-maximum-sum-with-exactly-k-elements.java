class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];

        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }

        return k * max + (k * (k - 1)) / 2;
    }
}