import java.util.HashSet;

class Solution {
    public int smallestAbsent(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            set.add(num);
            sum += num;
        }

        int ans = Math.max(1, sum / nums.length + 1);

        while (set.contains(ans)) {
            ans++;
        }

        return ans;
    }
}