import java.util.Arrays;

class Solution {
    public int[] sortByReflection(int[] nums) {
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            int x = reflect(a);
            int y = reflect(b);

            if (x != y) {
                return Integer.compare(x, y);
            }

            return Integer.compare(a, b);
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }

    private int reflect(int n) {
        int result = 0;

        while (n > 0) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }

        return result;
    }
}