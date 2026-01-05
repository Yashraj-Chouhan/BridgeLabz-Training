package linkedlist.circularLinkedList.roundrobin;

public class CircularProcessList {

    private ProcessNode head;
    private ProcessNode tail;
    private int processCount;

    // Add process at end
    public void addProcess(int pid, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burst, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        processCount++;
    }

    // Remove process by ID
    private void removeProcess(ProcessNode prev, ProcessNode current) {
        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            tail.next = head;
        } else if (current == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = current.next;
        }
        processCount--;
    }

    // Simulate Round Robin Scheduling
    public void roundRobinSchedule(int timeQuantum) {

        if (head == null) {
            System.out.println("No processes available");
            return;
        }

        int currentTime = 0;
        double totalWaitingTime = 0;
        double totalTurnAroundTime = 0;

        ProcessNode current = head;
        ProcessNode prev = tail;

        System.out.println("\n--- Round Robin Scheduling Start ---");

        while (processCount > 0) {

            if (current.remainingTime > 0) {

                int executedTime = Math.min(current.remainingTime, timeQuantum);
                current.remainingTime -= executedTime;
                currentTime += executedTime;

                System.out.println(
                        "Process P" + current.processId +
                        " executed for " + executedTime +
                        " units | Remaining: " + current.remainingTime
                );

                if (current.remainingTime == 0) {
                    current.turnAroundTime = currentTime;
                    current.waitingTime =
                            current.turnAroundTime - current.burstTime;

                    totalWaitingTime += current.waitingTime;
                    totalTurnAroundTime += current.turnAroundTime;

                    System.out.println(
                            "Process P" + current.processId + " completed."
                    );

                    removeProcess(prev, current);
                    current = prev.next;
                    displayProcesses();
                    continue;
                }
            }

            prev = current;
            current = current.next;
        }

        System.out.println("\n--- Scheduling Complete ---");
        System.out.println("Average Waiting Time = " +
                (totalWaitingTime / (totalTurnAroundTime == 0 ? 1 : (totalTurnAroundTime / totalTurnAroundTime))));
        System.out.println("Average Turnaround Time = " +
                (totalTurnAroundTime / (totalTurnAroundTime == 0 ? 1 : (totalTurnAroundTime / totalTurnAroundTime))));
    }

    // Display circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("Process queue is empty");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Queue: ");

        do {
            System.out.print(
                    "P" + temp.processId +
                    "(RT:" + temp.remainingTime + ") -> "
            );
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
}
