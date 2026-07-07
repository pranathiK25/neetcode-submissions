class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // // brute
        // List<List<Integer>> ans = new ArrayList<>();
        // HashSet<List<Integer>> set = new HashSet<>();


        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         for(int k = j + 1; k < nums.length; k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 List<Integer> temp = new ArrayList<>();
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);
        //                 Collections.sort(temp);
        //                 set.add(temp);
        //             }
        //         }
        //     }
        // }
        // for(List<Integer> li : set){
        //     ans.add(li);
        // }
        // return ans;


        //better
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set;
        HashSet<List<Integer>> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++){
                int third = -(nums[i] + nums[j]);
                if(set.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                set.add(nums[j]);
            }
        }
        for(List<Integer> li : st){
            ans.add(li);
        }
        return ans;
    }
}
