class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int cnt = 1;
        int prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(prevEnd <= intervals[i][0]){
                cnt++;
                prevEnd = intervals[i][1];
            }
        }
        return n - cnt;
    }
}
