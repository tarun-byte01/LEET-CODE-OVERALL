class Solution {
    public long findMaximumNumber(long k, int x) {
        long left = 1;
        long right = (long) 1e15;

        while (left < right) {
            long mid = left + (right - left + 1) / 2;

            if (getSumPrices(mid, x) <= k) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private long getSumPrices(long num, int x) {
        long sum = 0;
        num++;

        for (int i = x; i <= 60; i += x) {
            long groupSize = 1L << i;
            long half = 1L << (i - 1);

            sum += (num / groupSize) * half;
            sum += Math.max(0L, (num % groupSize) - half);
        }

        return sum;
    }
}