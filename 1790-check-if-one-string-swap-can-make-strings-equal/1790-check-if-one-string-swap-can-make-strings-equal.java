class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        
        int firstIdx = -1;
        int secondIdx = -1;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (firstIdx == -1) {
                    firstIdx = i;
                } else if (secondIdx == -1) {
                    secondIdx = i;
                } else {
                    // More than 2 mismatches
                    return false;
                }
            }
        }
        
        // Exactly 2 mismatches found; check if swapping makes them equal
        return secondIdx != -1 
            && s1.charAt(firstIdx) == s2.charAt(secondIdx) 
            && s1.charAt(secondIdx) == s2.charAt(firstIdx);
    }
}