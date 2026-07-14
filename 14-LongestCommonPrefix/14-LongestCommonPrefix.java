// Last updated: 14/07/2026, 14:14:02
class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) 
         return "";

        for (int i = 0; i < strs[0].length(); i++)//flower
        {
            char c = strs[0].charAt(i);//l
            for (int j = 1; j < strs.length; j++)//j=1 j<16 
            {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) //f!=l
                {
                    return strs[0].substring(0, i);//0,0fl
                }
            }
        }
        return strs[0];
    }
}