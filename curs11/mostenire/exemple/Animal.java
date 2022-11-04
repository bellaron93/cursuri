package curs11.mostenire.exemple;

public class Animal {

    public String nume;

//    public Animal(){
//
//    }
    public Animal(String nume) {
        this.nume = nume;
        System.out.println("un nou ANIMAL");
    }

    public void mananca(){
        System.out.println("Animalul curent mananca");
    }
}
