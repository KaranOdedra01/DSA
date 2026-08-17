class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(); 
       for(int i = 0;i<address.length();i++){
        if(address.charAt(i) == '.'){
            sb.append("[.]");
        }
        else{
            sb.append(address.charAt(i));
        }
       }
       return sb.toString();

    // String s[] = address.split("\\.");
    // String b = "";
    // for(int i = 0;i<s.length;i++){
    //     b+=s[i];
    //     if(i < s.length-1){
            
    //          b += "[.]";
    //     }
    
    // }
    
    // return b;
    }

}