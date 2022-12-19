class Solution {
    public boolean isValid(String s) {
    Stack<Character> x = new Stack<>();
    for(Character ch : s.toCharArray()){
        if(ch =='(' || ch=='[' || ch=='{'){
            x.push(ch);
        }
    else if(ch==')' && !x.isEmpty() && x.peek() == '('){
        x.pop();
        }
        else if(ch==']' && !x.isEmpty() && x.peek() == '['){
        x.pop();
        }
        else if(ch=='}' && !x.isEmpty() && x.peek() == '{'){
        x.pop();
        }
        else{
            return false;
        }
    }
    return x.isEmpty();
