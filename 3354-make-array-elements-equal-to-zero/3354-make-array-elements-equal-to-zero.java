class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        int total = 0;

        for (int n : nums) {
            total += n;
        }

        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            int right = total - left;

            if (nums[i] == 0) {
                if (left == right) {
                    count += 2;
                } else if (Math.abs(left - right) == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}