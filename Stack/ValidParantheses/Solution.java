//([{}]) --> true ([{]}) --> false
class Solution{
  public boolean isValid(String s){
    Stack<Character> stack = new Stack<Character>();
    for(int i=0;i<s.length();i++){
      char cur=s.charAt(i);
      if(cur=='('){
        stack.push(')');
      }
      else if(cur=='['){
        stack.push(']');
      }
      else if(cur=='{'){
        stack.push('}');
      }
      else if(stack.isEmpty() || stack.pop()!=cur){
        return false;
      }
    }
    return stack.isEmpty();
  }
}
