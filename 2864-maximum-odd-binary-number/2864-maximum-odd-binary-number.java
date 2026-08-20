class Solution {
    public String maximumOddBinaryNumber(String s) {
        int i = 0;
        int j = s.length() - 1;

        char[] arr = s.toCharArray();

    
        while (i <= j) {
            if(arr[i]=='1'){
                i++;
            }
            else if(arr[j] == '0'){
                j--;
            }
           else  if(arr[i] == '0' && arr[j] == '1' && i < j){
                char temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }
        arr[j] = '0';
        arr[s.length()-1] = '1';

        return new String(arr);

        // int c = 0;
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == '1') {
        //         c++;
        //     }
        // }
        // if (c == 0) {
        //     return s;
        // }
        // // c = c - 1;
        // for (int i = 0; i < s.length()-1; i++) {
        //     if (c > 1) {
        //         sb.append('1');
        //         c--;
        //     }
        //     else{
        //         sb.append('0');
        //     }
        // }
        // sb.append('1');
        // return sb.toString();

    }
}