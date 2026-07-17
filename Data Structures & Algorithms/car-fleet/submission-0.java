class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 1) return 1;

        Stack<Double> st = new Stack<>();
        int[][] pair = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, java.util.Comparator.comparingInt(o -> o[0]));

        for(int i = pair.length - 1; i >= 0; i--){
            double currentTime = (double) (target - pair[i][0]) / pair[i][1];

            if(!st.isEmpty() && currentTime <= st.peek()){
                continue;
            } else{
                st.push(currentTime);
            }
        }
        return st.size();
    }
}
