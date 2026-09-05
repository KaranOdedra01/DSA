class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
      for(int i = 0;i<s.length();i++){
        for(int j = i;j<s.length();j++){
            String curr = s.substring(i,j+1);
            if(isPalind(curr) && curr.length() > longest.length()){
                longest = curr;
            }
        }
      }
        return longest;
    }

    private boolean isPalind(String sk){
        int i = 0;
        int j = sk.length()-1;

        while(i < j){
            if(sk.charAt(i) != sk.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}