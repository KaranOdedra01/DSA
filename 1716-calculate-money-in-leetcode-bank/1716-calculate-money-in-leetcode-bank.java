class Solution {
    public int totalMoney(int n) {
    //   int sum = 0;
    //   int count = 1;
    //   int count1 = 0;
    //   for(int i = 0; i < n; i++){
    //     if(i % 7 == 0){
    //         count1++;
    //     }
    //     sum += (i+count1);
    //   }
    //   return sum;


    int sum = 0;
    int week = n/7;
    sum = (28 * week) + (7 *(week *(week-1)/2));
    int rem = n%7;

    return sum+(rem*(rem+1)/2 + rem*week);
    }
}