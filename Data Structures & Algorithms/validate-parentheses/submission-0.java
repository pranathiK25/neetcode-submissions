class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']', '[');
        map.put('}','{');

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            } else{
                if(!st.isEmpty() && st.peek() == map.get(c)){
                    st.pop();
                } else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
