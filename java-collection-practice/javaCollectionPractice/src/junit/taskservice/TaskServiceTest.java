package junit.taskservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    TaskService service = new TaskService();

    @Test
    @Timeout(2)   // ❌ Test will FAIL (method takes 3 seconds)
    void testLongRunningTaskTimeout() throws InterruptedException {
        service.longRunningTask();
    }
}
