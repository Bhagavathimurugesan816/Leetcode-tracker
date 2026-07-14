// Last updated: 14/07/2026, 14:13:13
class Solution {

    public String makeLargestSpecial(String s) {

        int c = 0;
        int st = 0;

        List<String> l = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1')
                c++;
            else
                c--;

            if (c == 0) {

                String in = makeLargestSpecial(
                    s.substring(st + 1, i)
                );

                l.add("1" + in + "0");

                st = i + 1;
            }
        }

        Collections.sort(l, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (String x : l)
            sb.append(x);

        return sb.toString();
    }
}