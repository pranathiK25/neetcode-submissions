class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ans = new ArrayList<>();
        for(int i[] : intervals){
            if(ans.isEmpty() || ans.get(ans.size() - 1)[1] < i[0]){
                ans.add(i);
            } else {
                int last = ans.size() - 1;
                int maxEnd = Math.max(ans.get(last)[1], i[1]);
                ans.get(last)[1] = maxEnd;
            }
        }
        int[][] res = new int[ans.size()][2];
        int j = 0;
        for(int i[] : ans){
            res[j++] = i;
        }
        return res;
    }
}
