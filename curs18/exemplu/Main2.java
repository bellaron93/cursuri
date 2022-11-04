package curs18.exemplu;

public class Main2 {

    public static void method(Box<? super Integer> box){
        System.out.println(box.camp);
    }

    public static <X extends Number> X metodastaticaGenerica(X arg){
        return arg;
    }
    public static void main(String[] args) {
        Person andrei = new Person("Andrei", 12);
        Box<Person> wrongBox = new Box<>(andrei);
        Box<Integer> goodBox = new Box<>(1);
//        method(wrongBox);
        method(goodBox);
        metodastaticaGenerica(3);
//        metodastaticaGenerica("string")
    }
}
