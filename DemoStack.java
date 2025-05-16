import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);
        System.out.println("Top element (peek): " + stack.peek()); 
        int popped = stack.pop();
        System.out.println("Popped element: " + popped); 
        System.out.println("Stack after pop: " + stack);
        System.out.println("Position of 10 from top: " + stack.search(10)); 
        System.out.println("Is stack empty? " + stack.isEmpty()); 
        System.out.println("Stack size: " + stack.size());
        System.out.print("Iterating stack: ");
        for (Integer item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
