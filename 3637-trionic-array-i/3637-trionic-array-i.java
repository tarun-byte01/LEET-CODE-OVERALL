class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Step 1: Increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        if (i == 0) {
            return false;
        }

        // Step 2: Decreasing
        int peak = i;

        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        if (i == peak || i == n - 1) {
            return false;
        }

        // Step 3: Increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}