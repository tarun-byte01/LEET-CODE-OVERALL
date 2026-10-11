class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);

            if (s.length() % 2 != 0)
                continue;

            int mid = s.length() / 2;
            int left = 0, right = 0;

            for (int j = 0; j < mid; j++) {
                left += s.charAt(j) - '0';
                right += s.charAt(j + mid) - '0';
            }

            if (left == right)
                count++;
        }

        return count;
    }
}