class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int longest = 1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i < n ; i++ ){
            hs.add(nums[i]);
        }

        for(int i : hs){
            if(!hs.contains(i-1)){
                int cnt = 1;
                int x = i;
                while(hs.contains(x + 1)){
                    x++;
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}

