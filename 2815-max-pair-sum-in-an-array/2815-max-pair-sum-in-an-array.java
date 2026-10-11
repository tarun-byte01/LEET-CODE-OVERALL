class Solution {
    public int maxSum(int[] nums) {
        int max = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (maxDigit(nums[i]) == maxDigit(nums[j])) {
                    max = Math.max(max, nums[i] + nums[j]);
                }
            }
        }

        return max;
    }

    public int maxDigit(int n) {
        int max = 0;

        while (n > 0) {
            max = Math.max(max, n % 10);
            n /= 10;
        }

        return max;
    }
}