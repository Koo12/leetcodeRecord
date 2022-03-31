class Solution {
    public boolean isValid(String s) {
        boolean result = true;
        Stack stack = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            if(s.charAt(i)=='['){
                stack.push('[');
            }
            if(s.charAt(i)=='{'){
                stack.push('{');
            }
            if(s.charAt(i)==')'){
                if(stack.empty() || !(stack.peek().equals('('))){
                    result = false;
                }else{
                    stack.pop();
                }
            }
            if(s.charAt(i)==']'){
                if(stack.empty() || !(stack.peek().equals('['))){
                    result = false;
                }else{
                    stack.pop();
                }
            }
            if(s.charAt(i)=='}'){
                if(stack.empty() || !(stack.peek().equals('{'))){
                    result = false;
                }
                else{
                    stack.pop();
                }
            }
        }

        if(!stack.empty()){
            result = false;
        }

        return result;
    }
}