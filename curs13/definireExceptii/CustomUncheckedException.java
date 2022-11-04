package curs13.definireExceptii;

public class CustomUncheckedException extends RuntimeException {

    public CustomUncheckedException(String message) {
        super(message);
        System.out.println("constructor");
    }
}
