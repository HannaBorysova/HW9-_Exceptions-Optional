package main.java.com.hw9.executor;

import main.java.com.hw9.division.SafeDivision;
import main.java.com.hw9.exceptions.CaptedExceptions;
import main.java.com.hw9.rethrowing.RethrowingExceptions;

public class Executor {
    public static void exucute() {
        CaptedExceptions captedExceptions = new CaptedExceptions();
        captedExceptions.catchExceptionA();
        captedExceptions.catchExceptionB();
        captedExceptions.catchNullPointerException();
        captedExceptions.catchIOException();

        SafeDivision safeDivision = new SafeDivision();
        safeDivision.enterTwoNumbers();

        System.out.println("Task 3");
        RethrowingExceptions rethrowingExceptions = new RethrowingExceptions();
        try {
            rethrowingExceptions.someMethod();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
