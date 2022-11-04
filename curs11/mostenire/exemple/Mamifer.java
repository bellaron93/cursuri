package curs11.mostenire.exemple;

public class Mamifer extends Animal{
   //constructor default
/*    public Mamifer() {
        super();
    }*/
    public String tipMamifer;

    public Mamifer(String nume, String tipMamifer) {
        super(nume);
        this.tipMamifer = tipMamifer;
        System.out.println("Un nou MAMIFER");
    }

    public int naste(){
        System.out.println("acest mamifer naste");
        return 2;
    }

    @Override
    public void mananca(){
        System.out.println("Mamiferul de tipul: " + this.tipMamifer
        + " si numele: " + this.nume + "mananca");
    }
}
