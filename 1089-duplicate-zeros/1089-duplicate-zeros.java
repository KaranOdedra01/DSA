class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();
        int index = 0;
        for(int i = 0;i<n;i++){
            if(temp[index] == 0){
                arr[i] = 0;
                if(i < arr.length - 1)
                    arr[++i] = 0;
            }
            else{
                arr[i] = temp[index];
            }
            index++;
        }
    }
}