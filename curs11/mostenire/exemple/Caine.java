package curs11.mostenire.exemple;

public class Caine extends Mamifer{

    public Caine(String nume, String tipMamifer) {
        super(nume, tipMamifer);
        System.out.println("Un nou CAINE");
    }

    @Override
    public void mananca() {
        System.out.println("Cainele cu numele: " + this.nume + " mananca");
    }

    @Override
    public int naste() {
        System.out.println("Cainele "+ this.nume + " naste");
        return 1;
    }

    public void latra(){
        System.out.println("Ham ham");
    }
}
