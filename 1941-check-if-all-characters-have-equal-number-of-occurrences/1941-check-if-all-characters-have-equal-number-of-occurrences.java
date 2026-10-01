class Solution {
    public boolean areOccurrencesEqual(String s) {

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int first = 0;

        for (int x : count) {
            if (x > 0) {
                if (first == 0)
                    first = x;
                else if (x != first)
                    return false;
            }
        }

        return true;
    }
}