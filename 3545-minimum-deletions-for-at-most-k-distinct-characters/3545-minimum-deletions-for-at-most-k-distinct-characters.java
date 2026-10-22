import java.util.Arrays;

class Solution {
    public int minDeletion(String s, int k) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);

        int deletions = 0;

        for (int i = 0; i < 26 - k; i++) {
            deletions += freq[i];
        }

        return deletions;
    }
}