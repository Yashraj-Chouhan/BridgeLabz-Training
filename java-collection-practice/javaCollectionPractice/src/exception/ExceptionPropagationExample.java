package exception;
public class ExceptionPropagationExample {

    // Method 1: Throws exception
    static void method1() {
        int result = 10 / 0;   // ArithmeticException
    }

    // Method 2: Calls method1()
    static void method2() {
        method1();            // Exception propagates
    }

    public static void main(String[] args) {

        try {
            method2();        // Exception reaches main

        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
