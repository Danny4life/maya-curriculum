package olga.stack.classActivity0a;

import java.util.Stack;

public class DefaultStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();


        stack.push("one");
        stack.push("two");
        stack.push("three");

        stack.pop();
        System.out.println(stack);
    }
}
