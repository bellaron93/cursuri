package curs23.builtIn;

public class Student {

    private String nume;
    private String facultate;

    public Student(String nume, String facultate) {
        this.nume = nume;
        this.facultate = facultate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
}
