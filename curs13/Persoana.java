package curs13;

import curs13.definireExceptii.IncorrectCNPException;

public class Persoana {
    int varsta;
    String nume;
    String cnp;

    public Persoana(int varsta, String nume, String cnp) throws IncorrectCNPException {
        this.varsta = varsta;
        this.nume = nume;
        if(cnp.length() != 13){
            //arunc exceptie
            throw new IncorrectCNPException("cnp ul introdus are " + cnp.length() + " caractere, in loc de 13");
        }
        this.cnp = cnp;
    }

    public Persoana(int varsta) {
        this.varsta = varsta;
    }

    void display(){
        System.out.println(varsta + "   " + nume);
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }
}
