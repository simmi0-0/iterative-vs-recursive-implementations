import java.util.*;

public class InfixToPostfixRec {
    // function to check precedence
    static int prec(char ch) {
        if (ch == '+' || ch == '-') return 1; // + and - lowest
        if (ch == '*' || ch == '/') return 2; // * and / higher
        if (ch == '^') return 3; // ^ highest
        return -1; // not operator
    }

    // recursive function to convert
    static String convert(String exp, int i, Stack<Character> stack) {
        if (i == exp.length()) { // base case: end of string
            String res = "";
            while (!stack.isEmpty()) res += stack.pop(); // pop all left operators
            return res;
        }

        char c = exp.charAt(i); // current char
        String res = "";

        if (Character.isLetterOrDigit(c)) {
            res += c; // if operand, add to result
        } else if (c == '(') {
            stack.push(c); // push (
        } else if (c == ')') {
            while (!stack.isEmpty() && stack.peek() != '(') {
                res += stack.pop(); // pop until (
            }
            stack.pop(); // remove (
        } else { // operator
            while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
                res += stack.pop(); // pop higher/equal precedence
            }
            stack.push(c); // push current operator
        }

        // recursive call for next character
        return res + convert(exp, i + 1, stack);
    }

    public static void main(String[] args) {
        String exp = "(A+B)*C"; // sample infix
        Stack<Character> stack = new Stack<>();
        String postfix = convert(exp, 0, stack);
        System.out.println("Infix: " + exp);
        System.out.println("Postfix (recursive): " + postfix);
    }
}