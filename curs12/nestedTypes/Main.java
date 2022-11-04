package curs12.nestedTypes;

public class Main {
    public static void main(String[] args) {
       /* Outer.InnerStatic innerStatic = new Outer.InnerStatic(100);
        innerStatic.afiseaza();
        Outer.InnerStatic.afiseazaStatic();

        System.out.println("---------------------------");
        Outer outer = new Outer();
        //Outer.InnerClass innerClass = outer.new InnerClass(200);
        Outer.InnerClass innerClass = new Outer().new InnerClass(200);
        innerClass.afiseaza();*/
        Outer outer = new Outer();
        outer.methodOuter();
        outer.exempluClasaAnonima();
    }
}
