package curs12.claseabstracte;

public class Cerc extends FormaGeometrica{

    int raza;

    public Cerc(String nume, int raza) {
        super(nume);
        this.raza = raza;
    }

    @Override
    int getArie() {
        return (int)3.14*raza*raza;
    }

    @Override
    int getPerimetru() {
        return (int)(2*3.14*raza);
    }
}
