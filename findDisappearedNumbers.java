class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //CORRECT
       //first, we create temp array to store the numbers
       //similar solution as missing number
       //store the array length
       //loop through the array and store the numbers in a hashset
        //then, loop from 1 to n (array length) and check if the number exists in the hashset
        int n = nums.length;
        ArrayList<Integer> tempArray = new ArrayList<>();
        HashSet<Integer> tempHash = new HashSet<>();
        for (int num: nums){
            tempHash.add(num);
        }
        //dont need to loop through hashset because we need to check from 1 to n from nums array already. only hashmap then you need to loop
        for (int i = 1; i <= n; i++){
            if (!tempHash.contains(i)){
                    //if index in nums array does not exist in temphash, then add in temp array
                    tempArray.add(i);
            }
        }
        return tempArray;
    }
}