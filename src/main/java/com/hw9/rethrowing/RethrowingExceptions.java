package main.java.com.hw9.rethrowing;


public class RethrowingExceptions {
    public void someMethod() throws IllegalArgumentException {
        someMethod2();
    }

    public void someMethod2() throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }
}
