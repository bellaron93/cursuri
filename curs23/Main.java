package curs23;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------- implementare Logger folosind OOP ------");
        Logger logger = new LoggerImpl();
        logger.print("exemplu");

        System.out.println("---------- implementare Logger folosind Programare Functionala ------");
//        Logger logger2 = input -> System.out.println("Logger programare functionala: " + input);
        Logger logger2 = (String input) -> {
            System.out.println("Logger programare functionala: " + input);
            };
        logger2.print("exemplu");

        System.out.println("---------- implementare Logger folosind Programare Functionala cu REFERINTA------");
        Logger logger3 = System.out::println;
        logger3.print("exemplu referinta la metoda");
        Logger logger4 = Main::afisare;
        logger4.print("exemplu");


        MathI increaseByTwo = ( Integer input) -> {
            System.out.println("fac o adunare cu 2");
            return input + 2;
        };

        System.out.println(increaseByTwo.increase(10));
    }

    public  static void afisare(String x){
        System.out.println("afisare complexa: ");
        System.out.println("---------: " + x);
    }
}
