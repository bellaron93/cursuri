package curs11.mostenire.exercitii;

public class Student extends Persoana{

    String name;
    String facultate;
    double medie;

    public Student(String name, int age, String facultate, double medie) {
        super(name, age);
        this.name = "Andrei";
        this.facultate = facultate;
        this.medie = medie;
        System.out.println("constructor student");
    }

    @Override
     public void afiseaza(){
        System.out.println("Studentul cu numele: " + this.name + "  si numele de PERSOANA:"+ super.name+ " si varsta: " + this.age + " are media: " + this.medie+ " la facultatea: " + this.facultate);
    }
}
