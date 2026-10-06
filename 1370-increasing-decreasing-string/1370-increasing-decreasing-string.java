class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();

        while (result.length() < s.length()) {

            // Increasing: a -> z
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    result.append((char) ('a' + i));
                    freq[i]--;
                }
            }

            // Decreasing: z -> a
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    result.append((char) ('a' + i));
                    freq[i]--;
                }
            }
        }

        return result.toString();
    }
}
