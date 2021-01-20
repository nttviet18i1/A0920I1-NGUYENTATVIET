package _10_generic_stack_queue;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack  = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

//        System.out.println(myStack.peek());
//        System.out.println("size: "+myStack.size());
//        System.out.println(myStack.pop());
//        System.out.println("size: "+myStack.size());
        System.out.println(myStack.empty());

    }
}
