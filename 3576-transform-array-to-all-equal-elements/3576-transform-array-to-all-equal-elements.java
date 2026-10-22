class Solution {
public boolean canMakeEqual(int[] nums, int k) {
return check(nums, 1, k) || check(nums, -1, k);
}


private boolean check(int[] nums, int target, int k) {
    int[] arr = nums.clone();
    int operations = 0;
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        if (arr[i] != target) {
            arr[i] = -arr[i];
            arr[i + 1] = -arr[i + 1];
            operations++;
        }
    }

    return arr[n - 1] == target && operations <= k;
}


}
