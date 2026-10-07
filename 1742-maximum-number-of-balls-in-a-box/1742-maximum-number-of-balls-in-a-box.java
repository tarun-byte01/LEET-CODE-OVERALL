class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] boxes = new int[46];
        int max = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int n = i;
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            boxes[sum]++;
            max = Math.max(max, boxes[sum]);
        }

        return max;
    }
}
