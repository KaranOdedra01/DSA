class Solution {
    public String capitalizeTitle(String s) {
        StringBuilder sb = new StringBuilder();
        String[] word = s.split(" ");
        boolean flag = false;
        for(String w : word ){
            if(w.length() <= 2){
                sb.append(w.toLowerCase());
            }
            else{
                sb.append(Character.toUpperCase(w.charAt(0)));
                sb.append(w.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        sb.delete(s.length(),s.length()+1);
        return sb.toString();
    }
}