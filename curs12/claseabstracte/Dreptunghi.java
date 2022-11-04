package curs12.claseabstracte;

public class Dreptunghi extends FormaGeometrica{

    int latime;
    int lungime;

    public Dreptunghi(String nume, int latime, int lungime) {
        super(nume);
        this.latime = latime;
        this.lungime = lungime;
    }

    @Override
    int getArie() {
        return lungime*latime;
    }

    @Override
    int getPerimetru() {
        return 2*(lungime*latime);
    }

    int comportamentSuplimentar(){
        return 2;
    }
}
