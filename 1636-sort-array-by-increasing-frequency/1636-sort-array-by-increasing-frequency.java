import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        Integer[] a = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[i];
        }

        Arrays.sort(a, (x, y) -> {
            if (freq.get(x).equals(freq.get(y))) {
                return y - x;
            }
            return freq.get(x) - freq.get(y);
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }

        return nums;
    }
}