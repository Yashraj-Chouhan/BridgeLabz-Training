package runtimeanalysis;
public class StringConcatenationPerformance {

    // ---------- Using String (Immutable) ----------
    public static void testString(int n) {
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "a";
        }

        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + " ms");
    }

    // ---------- Using StringBuilder (Mutable, Fast) ----------
    public static void testStringBuilder(int n) {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");
    }

    // ---------- Using StringBuffer (Thread-safe) ----------
    public static void testStringBuffer(int n) {
        long start = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        for (int n : sizes) {
            System.out.println("\nOperations Count: " + n);

            // Avoid String for very large input (can hang system)
            if (n <= 10000) {
                testString(n);
            } else {
                System.out.println("String Time: Skipped (Too Slow)");
            }

            testStringBuilder(n);
            testStringBuffer(n);
        }
    }
}
