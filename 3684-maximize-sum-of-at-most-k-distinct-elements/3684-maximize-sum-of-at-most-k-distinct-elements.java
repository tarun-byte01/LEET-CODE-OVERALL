import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            list.add(nums[i]);

            if (list.size() == k) {
                break;
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}