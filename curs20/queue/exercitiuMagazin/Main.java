package curs20.queue.exercitiuMagazin;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TODO de adaugat si folosit clasa Client
        ArrayDeque<String> clienti = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bine ai venit! Introdu una din comenzile: add, pay, display_first");
        String[] comenzi = scanner.nextLine().split(" ");

        while (!comenzi[0].equalsIgnoreCase("stop")){
            switch (comenzi[0]){
                case "add": {
                    clienti.offerLast(comenzi[1]);
                    break;
                }
                case "pay": {
                    clienti.pollFirst();
                    break;
                }
                case "display_first": {
                    System.out.println(clienti.peekFirst());
                    break;
                }
                case "display_last":{
                    if(clienti.peekLast()!= null) {
                        System.out.println(clienti.peekLast());
                    } else{
                        System.out.println(" nu e nimeni la coada");
                    }
                    break;
                }
                default: {
                    System.out.println("ai introdus o comanda gresita");
                }
            }
            comenzi = scanner.nextLine().split(" ");
        }
    }
}
