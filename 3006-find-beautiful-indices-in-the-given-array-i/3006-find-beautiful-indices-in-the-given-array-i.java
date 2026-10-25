import java.util.*;

class Solution {
public List<Integer> beautifulIndices(String s, String a, String b, int k) {
List<Integer> listA = new ArrayList<>();
List<Integer> listB = new ArrayList<>();
List<Integer> result = new ArrayList<>();


    for (int i = 0; i <= s.length() - a.length(); i++) {
        if (s.startsWith(a, i)) {
            listA.add(i);
        }
    }

    for (int i = 0; i <= s.length() - b.length(); i++) {
        if (s.startsWith(b, i)) {
            listB.add(i);
        }
    }

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


}
