class Solution {
    //MY SOLUTION -> WRONG
    // public boolean containsDuplicate(int[] nums) {
    //     //loop through the array and store the array index in a variable
    //     //if content is the same as previous then you output true or false
    //     //if got same number -> true
    //     //if got no same number -> false
    //     int temp = 0;
    //     for (int i =0;i < nums.length; i++){
    //         if (temp != nums[i]){
    //             temp = nums[i];
    //         }
    //         return true;
    //     }
    //     return false;
    // }

    //A hash set is perfect for storing unique items and check for item existence in constant time on average 
    public boolean containsDuplicate(int[] nums){
        //create the hashset
        HashSet<Integer> seen = new HashSet<>();

        //if number is NOT added in hashset, means theres a duplicate
        for (int num: nums){
            if (!seen.add(num)){
                return true;
            }
            
        }
        //else,
            return false;
    }
}

