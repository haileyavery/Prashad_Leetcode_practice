class Solution {
    public int missingNumber(int[] nums) {
        //ok CORRECT BUT LOWKEY TOO MUCH HAHAHA

        //first, we store nums array length in a variable
        //we loop through nums array
        //while looping, store each numbers in a hashset and when we loop the hashset, we loop the array and check if the index exists in the hashset
        // int n = nums.length;
        // //create a new hashset
        // HashSet<Integer> tempHash = new HashSet<>();
        // for (int num: nums){
        //     tempHash.add(num);
        // }
        // //iterate through hashset
        // for (Integer ele: tempHash){
        //     for (int i = 0; i <= n; i++){
        //         if (!tempHash.contains(i)){
        //             return i;
        //         }
        //     }
        // }
        // return -1;

        //big brain way to do it:
        //sum of all NATURAL NUMBERS: n*(n+1)/2 (in a 0 to n range)
        //to find missing number, sum of all natural numbers - the sum of all the numbers you have so far
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num: nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}