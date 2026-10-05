class Solution {
    public String decodeMessage(String key, String message) {

        char[] map = new char[26];
        boolean[] used = new boolean[26];

        int index = 0;

        // Build substitution mapping
        for (char ch : key.toCharArray()) {

            if (ch == ' ') {
                continue;
            }

            int pos = ch - 'a';

            if (!used[pos]) {
                map[index] = ch;
                used[pos] = true;
                index++;
            }

            if (index == 26) {
                break;
            }
        }

        StringBuilder ans = new StringBuilder();

        // Decode message
        for (char ch : message.toCharArray()) {

            if (ch == ' ') {
                ans.append(' ');
            } else {
                int pos = ch - 'a';

                // Find which alphabet position maps to this character
                for (int i = 0; i < 26; i++) {
                    if (map[i] == ch) {
                        ans.append((char)('a' + i));
                        break;
                    }
                }
            }
        }

        return ans.toString();
    }
}