package curs22.generice;

public class Box <T>{

    private T camp;

    public Box(T camp) {
        this.camp = camp;
    }

    public T getCamp() {
        return camp;
    }

    public T getTranslatedInfo(T input){
        System.out.println(input);
        //o procesare generica
        return input;
    }

    public <U,X> U genericMethod(U input1, X input2){
        System.out.println(input1);
        //o procesare generica la nivel de metodata statica/non-statica
        return input1;
    }
}
