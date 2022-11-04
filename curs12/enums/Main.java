package curs12.enums;

import static curs12.enums.VALORI.DOI;
import static curs12.enums.VALORI.UNU;

public class Main {

    public static void main(String[] args) {
        System.out.println(DOI);
        VALORI[] values = VALORI.values();
        for(VALORI v: values){
            System.out.println(v);
        }
        VALORI unu = VALORI.valueOf("UNU");
        System.out.println(unu);
        System.out.println(DOI.ordinal());
        //switch
        switch(unu){
            case DOI:{
                System.out.println("cazul doi");
                break;
            }
            case UNU:{
                System.out.println("cazul egal cu unu");
                break;
            }
            case TREI:{
                System.out.println("cazul egal cu trei");
                break;
            }
        }
    }
}
