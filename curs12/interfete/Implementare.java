package curs12.interfete;

public class Implementare implements I1, I2 {

    public void simpleMethod(){
        System.out.println("am apelat metoda simpla");
    }

    public String complexMethod(String input){
        System.out.println("Afisez metoda complexa si argument: " + input);
        return input + "lala";
    }

    @Override
    public void defaultMethod() {
        //pot sa adaug comportament particular
//        System.out.println("comportament particular");
        I1.super.defaultMethod();
    }

    @Override
    public void method() {
        System.out.println("Apelez metoda mostenita din I2");
    }
}
