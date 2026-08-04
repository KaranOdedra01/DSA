class Solution {
    public int sumOfUnique(int[] nums) {
    //     HashMap<Integer,Integer> un = new HashMap<>();
    //     int c = 1; 

    //     for(int i = 0;i<nums.length;i++){
    //         if(un.containsKey(nums[i])){
    //             un.put(nums[i],un.get(nums[i])+1);
    //             // c++;
    //         }
    //         else{
    //             un.put(nums[i],1);
    //         }
    //     }
    //     int sum = 0;
    //     for(Map.Entry<Integer,Integer> re : un.entrySet()){
    //         if(re.getValue() == 1){
    //             sum+=re.getKey();
    //         }
    //     }
    // return sum;


    int[] freq = new int[101];

    for(int i :nums){
        freq[i]++;
    }
    int sum = 0;
    for(int i = 0;i<101;i++){
        if(freq[i] == 1) sum += i;
    }
    return sum;


        
    }
}