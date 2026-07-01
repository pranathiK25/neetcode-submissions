class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // // HashMap<Integer> hm1 = new HashMap<>();
        // // HashMap<Integer> hm2 = new HashMap<>();

        //1
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);        
    }
}
