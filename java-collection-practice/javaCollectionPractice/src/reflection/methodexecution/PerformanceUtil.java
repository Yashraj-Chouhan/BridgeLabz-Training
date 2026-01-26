package reflection.methodexecution;
import java.lang.reflect.Method;

public class PerformanceUtil {

    public static void measureExecutionTime(
            Object obj, String methodName) throws Exception {

        Method method = obj.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);

        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
