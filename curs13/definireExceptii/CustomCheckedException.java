package curs13.definireExceptii;

public class CustomCheckedException extends Exception{

    @Override
    public String getMessage() {
        System.out.println("asta e mesajul erorii");
        return super.getMessage();
    }
}
