package reflection.methodexecution;
public class Task {

    public void runTask() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Task completed");
    }
}
