class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;


        HashSet<Integer> hs = new HashSet<>();
        for(int n : nums){
            if(!hs.add(n)){
                return true;
            }
        }
        return false;
    }
}