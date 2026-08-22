class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int rem = 0;
        int mul = 1;
        int temp = n;
        while(temp > 0){
            rem = temp % 10;
            sum = sum + rem;
            mul = mul * rem;
            temp = temp / 10;
        }
         
         if(n % (sum + mul) == 0){
            return true;
         }
        return false;
    }
}