import java.util.*;

public class InfixToPostfixIter {
    // function to check precedence
    static int prec(char ch) {
        if (ch == '+' || ch == '-') return 1; // + and - lowest
        if (ch == '*' || ch == '/') return 2; // * and / higher
        if (ch == '^') return 3; // ^ highest
        return -1; // not operator
    }

    // iterative conversion
    static String convert(String exp) {
        String result = ""; // final postfix
        Stack<Character> stack = new Stack<>(); // stack for operators

        for (int i = 0; i < exp.length(); i++) { // loop through string
            char c = exp.charAt(i); // current char

            if (Character.isLetterOrDigit(c)) {
                result += c; // operand goes straight to result
            } else if (c == '(') {
                stack.push(c); // push (
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop(); // pop until (
                }
                stack.pop(); // remove (
            } else { // operator
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
                    result += stack.pop(); // pop higher/equal precedence
                }
                stack.push(c); // push operator
            }
        }

        // pop remaining operators
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result; // return postfix
    }

    public static void main(String[] args) {
        String exp = "(A+B)*C"; // sample infix
        String postfix = convert(exp);
        System.out.println("Infix: " + exp);
        System.out.println("Postfix (iterative): " + postfix);
    }
}