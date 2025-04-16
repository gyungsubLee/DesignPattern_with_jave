package _03_behavioral_patterns._15_interpreter._01_before;


import java.util.ArrayDeque;
import java.util.Deque;

public class PostFixNotation {

    private final String expression;

    public PostFixNotation(String expression) {
        this.expression = expression;
    }

    public static void main(String[] args) {
        PostFixNotation postFixNotation = new PostFixNotation("123+-");
        postFixNotation.calculate();
    }

    private void calculate() {
        // Stack<Integer> numbers = new Stack<>(); // 강의 코드
        Deque<Integer> numbers = new ArrayDeque<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
        }
        System.out.println(numbers.pop());
    }
}
