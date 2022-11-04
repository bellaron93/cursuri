package curs15.clasaSystem.exercitiu;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String numeStudent;
        int[] note = new int[3];

        Console console = System.console();
/*        String line = console.readLine();
        while (!line.equals("STOP")){
            System.out.println(line);
            line = console.readLine();
        }*/

        numeStudent = console.readLine();
        System.out.println("Nume student: " + numeStudent);
        System.out.println("Introdu notele studentului: ");
        String notaAsString = console.readLine();
        int nrNote = 0;
        while (!notaAsString.equals("STOP")){
            //tema-> sa va asigurati ca e numar, altfel incheiem cu exitcode = 20;
            if(nrNote == 5){
                System.err.println("Nu poti scrie mai mult de 5 note");
                System.exit(3);
            }
            int nota = Integer.parseInt(notaAsString);
            if(nota < 1 || nota > 10){
                System.exit(2);
            }
            if(nrNote == note.length){
                int[] aux = new int[note.length +1];
                System.arraycopy(note, 0, aux, 0, note.length);
                note = aux;
            }
            note[nrNote] = nota;

            notaAsString = console.readLine();
            nrNote++;
        }
        for(int i: note){
            System.out.print(i + " ");
        }
        System.out.println();
        long endTime = System.currentTimeMillis();
        long total = (endTime - startTime)/1000;
        System.out.println("Timpul total de executie este: " + total);
    }
}
