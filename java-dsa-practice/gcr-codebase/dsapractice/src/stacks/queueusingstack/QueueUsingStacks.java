package stacks.queueusingstack;

import java.util.Stack;
public class QueueUsingStacks {

    private Stack<Integer> stackEnqueue;
    private Stack<Integer> stackDequeue;

    // Constructor
    public QueueUsingStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int data) {
        stackEnqueue.push(data);
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {

        if (stackDequeue.isEmpty()) {

            // Transfer elements only when needed
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        if (stackDequeue.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stackDequeue.pop();
    }

    // Display front element
    public int peek() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        if (stackDequeue.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stackDequeue.peek();
    }
}
