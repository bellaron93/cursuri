package curs13.exemple;

import curs13.Persoana;
import curs13.definireExceptii.BadNumberException;
import curs13.definireExceptii.IncorrectCNPException;

public class Main {

    public static void main(String[] args){

        try {
            Persoana p1 = new Persoana(26, "Andrei", "1111111111111");
            Persoana p2 = new Persoana(24, "Ioana", "222222222222");

            System.out.println(p2.getVarsta());
        } catch (IncorrectCNPException e){
            System.out.println("MESAJ 1: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("MESAJ 2: " + e.getMessage());
        } finally {
            System.out.println("s-a executat tot");
        }
        System.out.println("-------------EXEMPLU-----------------");

        try {
            Persoana p2 = new Persoana(24, "Ioana", "2222222222222");
            int rez = divide(12,0);
            System.out.println("Rezultatul este: "+rez);
        } catch (BadNumberException| IncorrectCNPException  e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("printare din finally");
        }
    }

    public static int divide(int deimpartit, int impartitor) throws BadNumberException {

        if(impartitor == 0){
            throw new BadNumberException("nu poti imparti la 0");
        }
        return deimpartit/impartitor;
    }
}
