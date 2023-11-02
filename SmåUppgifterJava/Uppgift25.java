package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift25 {
    public static void main(String[] args) {

        //Skapa ett program där ett tal läses in och det skrivs ut om talet är positivt eller
        //negativt.
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett tal: ");
        double input = Double.parseDouble(scan.nextLine());

        if (input <0) {
            System.out.println("Talet är negativt");
        } else {
            System.out.println("Talet är positivt");
        }

    }
}
