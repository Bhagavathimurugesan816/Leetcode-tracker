// Last updated: 14/07/2026, 14:13:06
class Solution {
    public String capitalizeTitle(String title) {
        String[] word = title.toLowerCase().split(" ");

        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > 2) {
                word[i] = Character.toUpperCase(word[i].charAt(0))
                           + word[i].substring(1);
            }
        }

        return String.join(" ", word);
    }
}