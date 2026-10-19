class Solution {
    public String concatHex36(int n) {
        int square = n * n;
        int cube = n * n * n;

        String hex = convert(square, 16);
        String base36 = convert(cube, 36);

        return hex + base36;
    }

    private String convert(int num, int base) {
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int remainder = num % base;
            result.append(digits.charAt(remainder));
            num = num / base;
        }

        return result.reverse().toString();
    }
}