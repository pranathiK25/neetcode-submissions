class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char sortArr[] = s.toCharArray();
            Arrays.sort(sortArr);
            String sorted = new String(sortArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        for(List<String> list : map.values()){
            ans.add(list);
        }
        return ans;
    }
}
