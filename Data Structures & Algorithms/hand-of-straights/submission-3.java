class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < hand.length; i++){
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }
        Arrays.sort(hand);
        for(int n : hand){
            if(map.get(n) > 0){
                for(int i = n; i < n + groupSize; i++){
                    if(map.getOrDefault(i, 0) == 0) return false;

                    map.put(i, map.get(i) - 1);
                }
            }
        }
        return true;
    }
}
