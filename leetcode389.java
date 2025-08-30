


public class Solution {
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        int i = 0;
        while (i < ss.length && ss[i] == tt[i]) {
            i++;
        }
        return tt[i];
    }
}
