class Solution {
    public boolean isIsomorphic(String s, String t) {
       //char[] word = new char[26];
       char[] w1 = new char[256];
       char[] w2 = new char[256];


       for(int i = 0;i<s.length();i++){
        char a = s.charAt(i);
        char b = t.charAt(i);


        if(w1[a] == '\u0000' && w2[b] == '\u0000'){
            w1[a] = b;
            w2[b] = a;
        }
        else if(w1[a] != b || w2[b] != a){
            return false;
        }
       }
       return true;
    
    }
}