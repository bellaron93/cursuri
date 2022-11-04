package curs12.nestedTypes;

public class Outer {
    private int outerValue = 10;
    private static String outerName = "outer";

    public void exempluClasaAnonima(){
        class CopilLocal extends Parent {
            @Override
            public void method(){
                System.out.println("Din copil din clasa locala");
            }
        }
        Parent object1 = new Copil();
        Parent object2 = new CopilLocal();
        Parent object3 = new Parent() {
            @Override
            public void method() {
                System.out.println("Din copil din clasa anonima");
            }
        };
        object1.method();
        object2.method();
        object3.method();

       /* InterfataParinte objectInterfata = new InterfataParinte() {
            @Override
            public void metoda() {

            }
        };*/
    }

    public void methodOuter(){
        System.out.println("methodOuter");
        int finalValue = 3;

        class LocalClass{
            int variabila;

            LocalClass(int variabila){
                this.variabila = variabila;
            }

            void method(){
                System.out.println("outervalue = " + outerValue);
                System.out.println("outerName = " + outerName);
                System.out.println("finalValue = " + finalValue);
                System.out.println("variabila = " + variabila);
            }
        }

        LocalClass instanta = new LocalClass(23);
        instanta.method();
        //finalValue++;
    }


    public class InnerClass {
        private int value;
        public static final String name = "inner class";

        public InnerClass(int value){
            this.value = value;
        }

        public void afiseaza(){
            System.out.println(value);
            System.out.println(name);
            System.out.println(outerValue);
            System.out.println(outerName);
        }


        // nu pot utiliza metoda statice
        /*public static void afiseazaStatic(){
            //method();
            //System.out.println(value);
            System.out.println(name);
            //System.out.println(outerValue);
            System.out.println(outerName);
        }*/
    }

    static class InnerStatic {
        private int value;
        private static String name = "static inner";

        public InnerStatic(int value) {
            this.value = value;
        }

        public void afiseaza(){
            //method();
            System.out.println(value);
            System.out.println(name);
            //System.out.println(outerValue);
            System.out.println(outerName);
        }

        public static void afiseazaStatic(){
            //method();
            //System.out.println(value);
            System.out.println(name);
            //System.out.println(outerValue);
            System.out.println(outerName);
        }
    }

}
