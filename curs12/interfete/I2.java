package curs12.interfete;

public interface I2 {

    void method();

    default void defaultMethod(){
        System.out.println("functionalitate metoda din I2");
    }
}
