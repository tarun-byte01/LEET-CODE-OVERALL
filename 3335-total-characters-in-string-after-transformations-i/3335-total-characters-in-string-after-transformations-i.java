class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int MOD = 1000000007;
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < t; i++) {
            int[] next = new int[26];

            for (int j = 0; j < 25; j++) {
                next[j + 1] = freq[j];
            }

            next[0] = freq[25];
            next[1] = (next[1] + freq[25]) % MOD;

            freq = next;
        }

        int result = 0;

        for (int count : freq) {
            result = (result + count) % MOD;
        }

        return result;
    }
}