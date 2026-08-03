class Solution {
    public int countValidPrefixes(String s) {
        int count = 0;
        int oneCount = 0;
        int zeroCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                oneCount++;
            }
            else{
                zeroCount++;
            }

            if(Math.abs(oneCount - zeroCount) <= 1){
                count++;
            }
        }

        return count;
    }
}