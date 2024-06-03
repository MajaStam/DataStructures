package Stacks;

public class StackApp {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        for (int i =0; i < 5 ; i++){
            stack.push(i);
        }
        stack.push(10);

        System.out.println(stack.peek());

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.peek());

    }

}
