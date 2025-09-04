class Solution {
    public int singleNumber(int[] nums) {
        //WRONG.
        //this time, its not hashset but a HASHMAP. 
        //first, create a hashmap
        //loop through the array and store the unique numbers as key and frequency as value
        //have a int var for frequency
    //     int frequency = 1;
    //     HashMap<Integer, Integer> tempHash = new HashMap<>();
    //     for (int num: nums){
    //         //to insert keys in hashmap, use put method
    //         tempHash.put((Integer)num, frequency);
            
    // }
    // //then we loop thru the hashmap
    // //fuck i forgot how to loop...
    // for (int num: nums){
    //     for (Integer key: tempHash.keySet()){
    //         if (key.equals(num)){
    //             //if key is equal to number in array, increase the frequency(value) of the key
    //             tempHash.put(key, tempHash.get(key) + 1);
    //         }
    //     }
    // }
    // //after looping thru the array
    // for (Integer key: tempHash.keySet()){
    //     if (tempHash.get(key) == 1){
    //         return key;
    //     }
    // }
    // return -1;

    //fml i hate hashmap. lets learn a new thing: XOR
    //what is XOR? -> represents binary. will show 1 if different and 0 if the same. it will cancel out numbers that appear twice. 
    // to do XOR operation, you use ^ symbol
    //first, consider negative case scenario: 1 digit in the a array
    //wow, so just have a var equal to 0 and you compare elem to tht var. return var ONLY if its still 0 -> means same number. 

    if (nums.length == 1){
        return nums[0];
    }
    int xor = 0;
    for (int num: nums){
        //here, if num = 6, we compare 6(binary) with 0(binary)
        //then if different, xor is updated with num
        //but if binary same, then xor is not updated. thts how we get the single number. 
        //to convert a number to binary, you just consistently divide by 2 and get the remainders.
        xor ^= num;
    }
    return xor;



}
}