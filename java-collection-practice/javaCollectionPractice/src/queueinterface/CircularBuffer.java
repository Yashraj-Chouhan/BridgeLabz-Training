package queueinterface;
import java.util.*;

public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int index = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int value) {
        buffer[index % size] = value;
        index++;
    }

    public void display() {
        int start = Math.max(0, index - size);
        for (int i = start; i < index; i++) {
            System.out.print(buffer[i % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        cb.display();
    }
}
