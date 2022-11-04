package curs11.mostenire.exercitii;

public class Persoana {
    String name;

    int age;

    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("constructor persoana");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afiseaza(){
        System.out.println("Persoana cu numele: " + this.name + " si varsta: " + this.age);
    }
}
