class Solution {
    public int evalRPN(String[] tokens) {
        List<String> tokensList = new ArrayList<>(Arrays.asList(tokens));
        return dfs(tokensList);
    }
    private int dfs(List<String> tokens){
        String token = tokens.remove(tokens.size() - 1);
        if(!"+-*/".contains(token)) return Integer.parseInt(token);

        int r = dfs(tokens);
        int l = dfs(tokens);
        switch(token){
            case "+" : return l + r;
            
            case "-" : return l - r;
            
            case "*" : return l * r;
            
            case "/" : return l / r;
            
        }
        return 0;
    }
}
