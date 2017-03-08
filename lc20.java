public class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch (c){
                case '(': st.push(c);break;
                case '{':st.push(c);break;
                case '[' :st.push(c);break;
                case ')': if(st.size()==0||st.pop()!='('){return false;}break;
                case '}': if(st.size()==0||st.pop()!='{'){return false;}break;
                case ']': if(st.size()==0||st.pop()!='['){return false;}break;
                default: continue;
            }
        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }
       
    }
}