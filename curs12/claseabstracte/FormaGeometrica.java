package curs12.claseabstracte;

public abstract class FormaGeometrica {

    String nume;

    public FormaGeometrica(String nume) {
        this.nume = nume;
    }

    abstract int getArie();
    abstract int getPerimetru();
}
