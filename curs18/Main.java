package curs18;

public class Main {

 /*   public static Integer boxResult(Box<Object, Object, Object> box){
        return 1;
    }*/

    public static Integer boxResult(Box<?, ?, ?> box){
        return 1;
    }

    public static Integer boxResultConstraints(Box<? super String, ? extends Number, ?> box){
        return 2;
    }

    public static void main(String[] args) {
        Box<String, Integer, Boolean> box1 = new Box<>();
        Box<Double, Character, Boolean> box2 = new Box<>();
        box1.camp1 = "Ana";
        box2.camp1 = 3.5;

        String s = Box.toString(true);
        String s1 = SimpleBox.transformaString(1);
        System.out.println("--------Metode Generice---------");
        System.out.println(s + 1);
        System.out.println(s1 + 1);
        System.out.println(Mate.sum(1,2));
        System.out.println(Mate.sum(1.3, 1.4));
//        System.out.println(Mate.sum("s","s"));
        System.out.println("-------Parametru box generic ---------");
        System.out.println(boxResult(box1));
        System.out.println("------SOLUTIE: wildcard------------");
        System.out.println(boxResultConstraints(box1));
//        System.out.println(boxResultConstraints(box2));
        Box<String, Float, String> box3 = new Box<>();
        System.out.println(boxResultConstraints(box3));
    }
}
