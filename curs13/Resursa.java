package curs13;

public class Resursa implements AutoCloseable{

    String nume;

    public Resursa(String nume) {
        this.nume = nume;
        System.out.println("------instantiez resursa: "+ nume + "------");
    }

    @Override
    public void close() throws Exception {
        System.out.println("-----aici  inchid resursa: "+ nume + "-----");
    }

    void folosesteResursa() throws Exception {
        System.out.println("-----se foloseste resursa: "+ nume + "----------");
        throw new Exception("nu s-a putut folosi resursa");
    }
}
