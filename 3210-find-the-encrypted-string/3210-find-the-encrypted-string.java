class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(s.charAt((i + k) % n));
        }

        return result.toString();
    }
}