class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c++;
            }
        }
        if (c == 0) {
            return s;
        }
        // c = c - 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (c > 1) {
                sb.append('1');
                c--;
            }
            else{
                sb.append('0');
            }
        }
        sb.append('1');
        return sb.toString();
    }
}