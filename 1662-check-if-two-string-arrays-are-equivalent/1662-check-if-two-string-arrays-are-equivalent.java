class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();

        for(String v1 : word1){
            w1.append(v1);
        }
        for(String v2 : word2){
            w2.append(v2);
        }

        if(w2.toString().equals(w1.toString())){
            return true;
        }
        return false;
    }
}