class Solution {
    public int trap(int[] height) {
        if(height.length == 0 || height == null) return 0;
        int l = 0;
        int r = height.length - 1;
        int leftM = height[l];
        int rightM = height[r];
        int res = 0;

        while(l < r){
            if(leftM < rightM){
                l++;
                leftM = Math.max(leftM, height[l]);
                res += leftM - height[l];
            } else{
                r--;
                rightM = Math.max(rightM, height[r]);
                res += rightM - height[r];
            }
        }
        return res;
    }
}
