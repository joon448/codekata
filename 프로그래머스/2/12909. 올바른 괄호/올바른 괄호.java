import java.util.Stack;
class Solution {
    boolean solution(String s) {
        char tmp;
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            switch(c){
            case '(' :
                stack.push('(');
                break;            
            case '{' :
                stack.push('{');
                break;
            case ')' :
                if(stack.isEmpty()){
                    return false;
                }
                tmp = stack.pop();
                if (tmp!='('){
                    return false;
                }
                break;
            case '}' :
                if(stack.isEmpty()){
                    return false;
                }
                tmp = stack.pop();
                if (tmp!='{'){
                    return false;
                }
                break;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;

    }
}