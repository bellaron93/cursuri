package curs21.claseUtilitare;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] comenzi = scanner.nextLine().split(" ");
        List<String> strings = Arrays.asList(comenzi);
        System.out.println(strings);
        System.out.println(comenzi);
        System.out.println(Arrays.toString(comenzi));
        Arrays.sort(comenzi);
        System.out.println(Arrays.toString(comenzi));
    }
}
