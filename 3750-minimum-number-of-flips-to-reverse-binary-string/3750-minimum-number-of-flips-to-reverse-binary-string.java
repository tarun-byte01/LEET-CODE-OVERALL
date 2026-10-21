class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                count += 2;
            }
        }

        return count;
    }
}