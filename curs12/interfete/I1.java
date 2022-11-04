package curs12.interfete;

public interface I1 {

    public static final int a = 10;
    int b = 12;

    public abstract void simpleMethod();
    String complexMethod(String input);

    default void defaultMethod(){
        System.out.println("functionalitate metoda din: " + helper());
    }

    private String helper(){
        return "I1";
    }
}
