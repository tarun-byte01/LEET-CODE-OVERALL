class Solution {
    public boolean digitCount(String num) {
        int[] freq = new int[10];

        // Count frequency of each digit
        for (char ch : num.toCharArray()) {
            freq[ch - '0']++;
        }

        // Check if freq[i] == num[i]
        for (int i = 0; i < num.length(); i++) {
            if (freq[i] != num.charAt(i) - '0') {
                return false;
            }
        }

        return true;
    }
}