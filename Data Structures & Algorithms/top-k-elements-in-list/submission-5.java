class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        for(int i = 0; i < k; i++){
            ans.add(pq.poll());
        }
        
        int[] res = new int[ans.size()];
        int j = 0;
        for(int i : ans){
            res[j] = i;
            j++;
        }
        return res;
    }
}
