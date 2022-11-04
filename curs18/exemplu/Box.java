package curs18.exemplu;

public class Box <T>{
    public T camp;

    public Box(T camp) {
        this.camp = camp;
    }

    public T method(T input){
        return camp;
    }

    public <U> U nonStaticGenericMethod(U input, T input2){
        return input;
    }

    public static <U,T> U staticGenericMethod(U input, T input2){
        return input;
    }
}
