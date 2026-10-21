class Solution {
    public int maxDistinct(String s) {
        int[] count = new int[26];
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (count[index] == 0) {
                ans++;
                count[index] = 1;
            }
        }

        return ans;
    }
}