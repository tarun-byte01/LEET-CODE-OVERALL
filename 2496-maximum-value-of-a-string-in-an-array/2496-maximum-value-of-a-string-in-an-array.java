class Solution {
    public int maximumValue(String[] strs) {

        int max = 0;

        for (String s : strs) {

            boolean isNumber = true;

            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isNumber = false;
                    break;
                }
            }

            int value;

            if (isNumber) {
                value = Integer.parseInt(s);
            } else {
                value = s.length();
            }

            max = Math.max(max, value);
        }

        return max;
    }
}
