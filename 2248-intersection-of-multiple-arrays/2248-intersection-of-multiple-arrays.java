import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> result = new ArrayList<>();

        int n = nums.length;
        int[] count = new int[1001];

        for (int[] arr : nums) {
            for (int num : arr) {
                count[num]++;
            }
        }

        for (int i = 1; i <= 1000; i++) {
            if (count[i] == n) {
                result.add(i);
            }
        }

        return result;
    }
}
