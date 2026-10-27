import java.util.*;

class Solution {
public long minimumCost(int[] nums, int k, int dist) {
int n = nums.length;
k--;


    Comparator<Integer> cmp = (a, b) -> {
        if (nums[a] != nums[b]) {
            return Integer.compare(nums[a], nums[b]);
        }
        return Integer.compare(a, b);
    };

    TreeSet<Integer> selected = new TreeSet<>(cmp);
    TreeSet<Integer> remaining = new TreeSet<>(cmp);

    long sum = 0;

    for (int i = 1; i <= dist + 1; i++) {
        selected.add(i);
        sum += nums[i];
    }

    while (selected.size() > k) {
        int index = selected.pollLast();
        sum -= nums[index];
        remaining.add(index);
    }

    long answer = sum;

    for (int right = dist + 2, left = 1; right < n; right++, left++) {
        remaining.add(right);

        if (selected.contains(left)) {
            selected.remove(left);
            sum -= nums[left];

            int smallest = remaining.pollFirst();
            selected.add(smallest);
            sum += nums[smallest];
        } else {
            remaining.remove(left);

            if (!remaining.isEmpty()
                    && nums[selected.last()] > nums[remaining.first()]) {
                int largest = selected.pollLast();
                sum -= nums[largest];
                remaining.add(largest);

                int smallest = remaining.pollFirst();
                selected.add(smallest);
                sum += nums[smallest];
            }
        }

        answer = Math.min(answer, sum);
    }

    return nums[0] + answer;
}


}
