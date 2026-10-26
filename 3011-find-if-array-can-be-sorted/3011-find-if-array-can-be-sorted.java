class Solution {
    public boolean canSortArray(int[] nums) {
        int prevMax = 0;
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int bits = Integer.bitCount(nums[i]);
            int min = nums[i];
            int max = nums[i];

            int j = i + 1;

            while (j < n && Integer.bitCount(nums[j]) == bits) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                j++;
            }

            if (prevMax > min) {
                return false;
            }

            prevMax = max;
            i = j;
        }

        return true;
    }
}