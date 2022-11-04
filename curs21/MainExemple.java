package curs21;

import java.util.HashMap;
import java.util.Map;

public class MainExemple {

    public static void main(String[] args) {
        exemplu1();
        System.out.println("-------");
        exemplu2();
    }

    private static void exemplu2() {
        Map<Student, Integer> studentToNota = new HashMap<>();
        Student alex = new Student("Alex");
        studentToNota.put(alex, 10);
        System.out.println(alex.hashCode() + "  "+ studentToNota.get(alex));
        alex.setName("Alexandru");
        System.out.println(alex.hashCode() + "  "+ studentToNota.get(alex));
        studentToNota.put(new Student("Andrei"), 8);

        for( Map.Entry<Student, Integer> entry : studentToNota.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void exemplu1() {
        Map<String,Integer> locuitoriByOras = new HashMap<>();
        locuitoriByOras.put("Ploiesti", 200_000);
        locuitoriByOras.put("Pitesti", 150_000);
        locuitoriByOras.put("Bucuresti", 2_000_000);
        locuitoriByOras.replace("Bucuresti", 2_300_000);

        System.out.println(locuitoriByOras.get("Ploiesti"));
        System.out.println("Bucuresti" + locuitoriByOras.get("Bucuresti"));
        System.out.println(locuitoriByOras.containsKey("Pitesti"));
        System.out.println(locuitoriByOras.isEmpty());
//        locuitoriByOras.remove("Pitesti");
        System.out.println(locuitoriByOras.containsValue(150_000));

        System.out.println(locuitoriByOras.keySet());
    }
}
