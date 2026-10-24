import java.util.*;

class Solution {
public int maximumSetSize(int[] nums1, int[] nums2) {
Set<Integer> set1 = new HashSet<>();
Set<Integer> set2 = new HashSet<>();


    for (int num : nums1) {
        set1.add(num);
    }

    for (int num : nums2) {
        set2.add(num);
    }

    int n = nums1.length;
    int common = 0;
    int unique1 = 0;
    int unique2 = 0;

    for (int num : set1) {
        if (set2.contains(num)) {
            common++;
        } else {
            unique1++;
        }
    }

    for (int num : set2) {
        if (!set1.contains(num)) {
            unique2++;
        }
    }

    unique1 = Math.min(unique1, n / 2);
    unique2 = Math.min(unique2, n / 2);

    return Math.min(n, unique1 + unique2 + common);
}


}
