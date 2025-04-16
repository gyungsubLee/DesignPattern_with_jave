package _03_behavioral_patterns._15_interpreter._02_after;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixParser {

    public static PostfixExpression parse(String expression) {
        Deque<PostfixExpression> stack = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Deque<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(c);
        }
    }
}
