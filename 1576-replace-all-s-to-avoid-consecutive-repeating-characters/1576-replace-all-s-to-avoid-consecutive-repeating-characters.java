class Solution {
    public String modifyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '?') {
                char l = s.charAt(i);
                char r = s.charAt(i);
                if (i > 0) {
                    l = sb.charAt(sb.length() - 1);
                }
                if (i < s.length() - 1) {
                    r = s.charAt(i + 1);
                }
                ch = 'a';
                while (ch == l || ch == r) {
                    ch++;
                }
                sb.append(ch);
            } else {

                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}