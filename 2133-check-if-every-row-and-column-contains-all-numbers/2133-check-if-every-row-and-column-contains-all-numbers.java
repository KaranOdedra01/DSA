class Solution {
    public boolean checkValid(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        Set<Integer> rm = new HashSet<Integer>();
       int c = 0;
        for(int i = 0;i<m;i++){
            c= 0;
            for(int j = 0;j<m;j++){
                
               if(rm.contains(arr[i][j]))
                 return false;
               rm.add(arr[i][j]);
                
            }
            
            rm.clear();
            for(int j = 0;j<n;j++){
                if(rm.contains(arr[j][i]))
                    return false;
                rm.add(arr[j][i]);
                
            }
            rm.clear();
    }
        
    
    return true;
}
}
