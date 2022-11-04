package curs12.claseabstracte;

public class Main {

    public static void main(String[] args) {
        Cerc cerc1 = new Cerc("cerculMeu", 3);
        Dreptunghi drept1 = new Dreptunghi("dreptunghi1", 2,3);
        System.out.println("Comportament suplimentar:" + drept1.comportamentSuplimentar());
        System.out.println(cerc1.getArie());
        System.out.println(drept1.getArie());

        drept1.toString();
        FormaGeometrica[] forme = {cerc1, drept1};
        for(FormaGeometrica f1: forme){
            System.out.println(f1.getArie());
//            System.out.println(f1.comportamentSuplimentar());
        }
    }
}
