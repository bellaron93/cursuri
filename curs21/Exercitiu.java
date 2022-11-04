package curs21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Exercitiu {

    public static void main(String[] args) {
        Map<String, Integer> studentNameToGrade = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String[] comenzi = sc.nextLine().split(" ");
        while (! comenzi[0].equalsIgnoreCase("stop")){
            switch (comenzi[0]){
                case "check_grade": {
                    System.out.println("Cel putin un student are nota introdusa: " + studentNameToGrade.containsValue(Integer.parseInt(comenzi[1])));
                    break;
                }
                case "display_by_name": {
                    System.out.println(comenzi[1] + " : " +studentNameToGrade.get(comenzi[1]));
                    break;
                }
                case "add":{
                    studentNameToGrade.put(comenzi[1], Integer.parseInt(comenzi[2]));
                    break;
                }
                case "display": {
                    for(Map.Entry<String,Integer> entry: studentNameToGrade.entrySet()){
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                    break;
                }
                default:{
                    System.out.println("comanda gresita");
                }
            }
            comenzi = sc.nextLine().split(" ");
        }
    }
}
