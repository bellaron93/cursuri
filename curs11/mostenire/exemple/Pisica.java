package curs11.mostenire.exemple;

public class Pisica extends Mamifer{

    public Pisica(String nume, String tipMamifer) {
        super(nume, tipMamifer);
        System.out.println("O noua PISICA");
    }

    @Override
    public void mananca() {
        System.out.println("Pisica cu numele: " + this.nume + " mananca");
    }

    @Override
    public int naste() {
        System.out.println("Pisica " + this.nume + " naste");
        return 4;
    }
}
