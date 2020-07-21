package main.java.com.hw9.executor;

import main.java.com.hw9.division.SafeDivision;
import main.java.com.hw9.exceptions.ExceptionsDemonstration;
import main.java.com.hw9.rethrowing.RethrowingExceptions;

public class Executor {
    public static void execute() {
        ExceptionsDemonstration captedExceptions = new ExceptionsDemonstration();
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
