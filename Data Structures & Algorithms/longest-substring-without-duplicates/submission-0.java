class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == "") return 0;
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            if(!set.contains(c)){
                set.add(c);
            }
            

            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            r++;
        }
        return maxLen;
    }
}
