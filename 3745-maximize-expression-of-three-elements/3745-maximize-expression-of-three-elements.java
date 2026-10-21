class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }

            if (num >= largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        return largest + secondLargest - smallest;
    }
}