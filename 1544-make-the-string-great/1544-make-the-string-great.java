class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int n = stack.length();

            if (n > 0 && Math.abs(stack.charAt(n - 1) - c) == 32) {
                stack.deleteCharAt(n - 1);
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
}
