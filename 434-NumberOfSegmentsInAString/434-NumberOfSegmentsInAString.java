// Last updated: 14/07/2026, 14:13:17
class Solution {
    public int countSegments(String s) {
        int c =0;
        int str = s.length();
        for(int i = 0; i < str ; i++) {

            if(s.charAt(i) != ' ' &&
               (i == 0 || s.charAt(i - 1) == ' ')) {
                c++;
            }
        }
        return c;
    }
}