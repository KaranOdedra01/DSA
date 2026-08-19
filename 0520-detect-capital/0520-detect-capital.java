class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag = false;
        //word = word.toLowerCase();

        for(int i = 1;i<word.length();i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                if(!(word.charAt(i-1) >= 'A' && word.charAt(i-1) <= 'Z')){
                    return false;
                }
            }
            else if(i!=1 && (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')){
                if(word.charAt(i-1) >= 'A' && word.charAt(i-1) <= 'Z'){
                    return false;
                }
            }
        }
        return true;

    //  for(int i = 0;i<word.length()-1;i++){
    //     if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
    //         flag = true;
    //     }
    //     else if((word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') &&( word.charAt(i+1) >= 'a' && word.charAt(i+1) <= 'z')){
    //         flag =  true;
    //     }
    //     else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
    //         flag = true;
    //     }
    //  }   
    //  if(flag){
    //     return true;
    //  }
    //  return false;
    }
}