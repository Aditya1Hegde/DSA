class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int balance=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           if(c==')') balance--; 
           if(balance!=0) sb.append(c);
           if(c=='(') balance++;
        }
        return sb.toString();
    }
}