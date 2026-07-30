class Solution {
    public boolean checkValid(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        Set<Integer> rm = new HashSet<Integer>();
       int c = 0;
        for(int i = 0;i<m;i++){
            c= 0;
            for(int j = 0;j<m;j++){
                if(1<= arr[i][j] && arr[i][j] <= n){
               if(rm.contains(arr[i][j]))
                 return false;
               rm.add(arr[i][j]);
                }else
               {
                return false;
               }
                
            }
            rm.clear();
            for(int j = 0;j<n;j++){
                if(1<= arr[j][i] && arr[j][i] <= n){
                if(rm.contains(arr[j][i]))
                    return false;
                rm.add(arr[j][i]);
                }else{
                    return false;
                }
            }
            rm.clear();
    }
        
    return true;
    
}
}