import java.util.*;

class Solution {
public List<Integer> beautifulIndices(String s, String a, String b, int k) {
List<Integer> listA = findOccurrences(s, a);
List<Integer> listB = findOccurrences(s, b);
List<Integer> result = new ArrayList<>();


    int j = 0;

    for (int i : listA) {
        while (j < listB.size() && listB.get(j) < i - k) {
            j++;
        }

        if (j < listB.size() && listB.get(j) <= i + k) {
            result.add(i);
        }
    }

    return result;
}

private List<Integer> findOccurrences(String s, String pattern) {
    List<Integer> result = new ArrayList<>();
    int[] lps = new int[pattern.length()];

    int j = 0;

    for (int i = 1; i < pattern.length(); i++) {
        while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
            j = lps[j - 1];
        }

        if (pattern.charAt(i) == pattern.charAt(j)) {
            j++;
        }

        lps[i] = j;
    }

    j = 0;

    for (int i = 0; i < s.length(); i++) {
        while (j > 0 && s.charAt(i) != pattern.charAt(j)) {
            j = lps[j - 1];
        }

        if (s.charAt(i) == pattern.charAt(j)) {
            j++;
        }

        if (j == pattern.length()) {
            result.add(i - pattern.length() + 1);
            j = lps[j - 1];
        }
    }

    return result;
}


}
