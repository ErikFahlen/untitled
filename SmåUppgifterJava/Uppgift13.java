package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in ett tal: ");
        int number = Integer.parseInt(scan.nextLine());

        if (number % 2 == 0) {
            System.out.println("Talet är jämnt delbart");
        } else {
            System.out.println("Talet är ej jämnt delbart");
        }
    }
}
