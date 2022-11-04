package curs14.object;

import java.util.Objects;

public class Person {

    int age;
    String name;
    String cnp;
    String prenume;

    public Person(int age, String name, String cnp) {
        this.age = age;
        this.name = name;
        this.cnp = cnp;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.age == person.age && this.name.equals(person.name) && this.cnp.equals(person.cnp);
    }

    @Override
    public int hashCode() {
        //ar trebui sa verific maxim ce se verifica in equals
        /*e ok si forma asta
        return Objects.hash(name, cnp);*/

//        return Objects.hash(name, cnp, age);

       /* forma asta nu e ok
        return Objects.hash(age, prenume, name, cnp);*/

        //putem face manual
        return name.hashCode() + cnp.hashCode() + age;
    }
}
