class Solution {
    public int jump(int[] nums) {
        int l = 0;
        int r = 0;
        int jumps = 0;
        while(r < nums.length - 1){
            int maxR = 0;
            for(int i = l; i <= r; i++){
                maxR = Math.max(maxR, i + nums[i]);
            }
            l = r + 1;
            r = maxR;
            jumps++;
        }
        return jumps;
    }
}
