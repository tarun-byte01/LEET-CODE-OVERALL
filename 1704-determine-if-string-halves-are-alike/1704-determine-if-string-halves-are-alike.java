class Solution {
    public boolean halvesAreAlike(String s) {
        int left = 0, right = s.length() - 1;
        int vowelsCount = 0;
        
        while (left < right) {
            if (isVowel(s.charAt(left))) {
                vowelsCount++;
            }
            if (isVowel(s.charAt(right))) {
                vowelsCount--;
            }
            left++;
            right--;
        }
        
        return vowelsCount == 0;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}