class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int n : nums) {
            if (n < 10) {
                singleDigitSum += n;
            } else {
                doubleDigitSum += n;
            }
        }

        return singleDigitSum != doubleDigitSum;
    }
}