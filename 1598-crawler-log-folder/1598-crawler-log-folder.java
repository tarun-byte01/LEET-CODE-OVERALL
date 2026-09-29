class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } else if (log.equals("./")) {
                // Stay in the current folder
            } else {
                depth++;
            }
        }

        return depth;
    }
}
