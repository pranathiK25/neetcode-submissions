class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // // HashMap<Integer> hm1 = new HashMap<>();
        // // HashMap<Integer> hm2 = new HashMap<>();

        //1
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // return Arrays.equals(a, b);   

        // //2
        // HashMap<Character, Integer> hm1 = new HashMap<>();
        
        // HashMap<Character, Integer> hm2 = new HashMap<>();

        // for(int i = 0; i < s.length(); i++){
        //     hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0) + 1);
        //     hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i),0) + 1);
        // }

        // return hm1.equals(hm2);

        //3
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int i : arr){
            if(i != 0) return false;
        }

        return true;
    }
}
