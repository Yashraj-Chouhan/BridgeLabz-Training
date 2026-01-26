package reflection.methodexecution;
public class PerformanceTest {

    public static void main(String[] args) throws Exception {

        Task task = new Task();
        PerformanceUtil.measureExecutionTime(task, "runTask");
    }
}
