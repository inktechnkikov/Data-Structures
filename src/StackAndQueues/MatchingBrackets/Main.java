package StackAndQueues.MatchingBrackets;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String exp = "1 + (2 - 2(2 + 3) * 4 / (3 + 1)) * 5";
        for (int i = 0; i < exp.length(); i++) {
           char getBracket = exp.charAt(i);
           if(getBracket == '('){
               stack.push(i);
           }else if(getBracket == ')'){
               int startIndex = stack.pop();
               String substr = exp.substring(startIndex,i+1);
               System.out.println(substr);
           }
        }
    }
}
