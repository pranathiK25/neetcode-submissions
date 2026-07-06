class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while(l < n){
            if(nums[l] + nums[r] > target){
                r--;
            } else if(nums[l] + nums[r] < target){
                l++;
            } else{
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[]{};
    }
}
