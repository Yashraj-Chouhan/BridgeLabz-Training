package linkedlist.circularLinkedList.taskschedular;

public class CircularTaskList {

    private TaskNode head;
    private TaskNode tail;
    private TaskNode current; // for task scheduling

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = head;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int position, int id, String name, int priority, String date) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

    // Remove task by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = tail;

        do {
            if (temp.taskId == taskId) {

                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }

                if (current == temp) {
                    current = temp.next;
                }

                System.out.println("Task removed successfully");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    public void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        printTask(current);
        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        System.out.println("\nAll Tasks:");

        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search task by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                printTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with this priority");
        }
    }

    private void printTask(TaskNode t) {
        System.out.println(
                "ID: " + t.taskId +
                " | Name: " + t.taskName +
                " | Priority: " + t.priority +
                " | Due: " + t.dueDate
        );
    }
}

