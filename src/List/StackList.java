package List;

import java.util.Stack;

public class StackList {
    public static void main(String[] args) {
        Stack<Integer> stackexample=new Stack<>();
        stackexample.push(11);
        stackexample.push(23);
        stackexample.push(45);
        System.out.println(stackexample);
        stackexample.pop();
        System.out.println(stackexample);
        stackexample.push(232);
        stackexample.push(451);
        System.out.println(stackexample);
        System.out.println(stackexample.peek());

    }

}
