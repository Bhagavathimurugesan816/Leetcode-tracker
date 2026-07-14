// Last updated: 14/07/2026, 14:13:41
class Solution {
    public boolean isPalindrome(String s) {
        int n = 0;
        int t = s.length() - 1;

        while (n < t) {

            while (n < t && !Character.isLetterOrDigit(s.charAt(n))) {
                n++;
            }

            while (n< t && !Character.isLetterOrDigit(s.charAt(t))) {
                t--;
            }

            if (Character.toLowerCase(s.charAt(n)) !=
                Character.toLowerCase(s.charAt(t))) {
                return false;
            }

            n++;
            t--;
        }
        return true;
    }
}