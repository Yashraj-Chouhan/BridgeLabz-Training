package stacks.stacksort;

import java.util.Stack;

public class StackSortRecursive {

    // Function to sort stack
    public static void sortStack(Stack<Integer> stack) {

        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int temp = stack.pop();

        // Sort remaining stack
        sortStack(stack);

        // Insert element in sorted order
        insertSorted(stack, temp);
    }

    // Helper function to insert element in sorted order
    private static void insertSorted(Stack<Integer> stack, int element) {

        // Base condition
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, element);
        stack.push(temp);
    }

    // Driver code
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
