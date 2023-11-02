package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift30 {
    public static void main(String[] args) {

        //Läs in ett tal. Skriv ut om talet är mindre än 10, mindre än 100 eller större än 100.
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in ett tal: ");
        int input = Integer.parseInt(scan.nextLine());

        if (input < 10) {
            System.out.println("Talet är mindre än 10");
        } else if (input < 100){
            System.out.println("Talet är mindre än 100");
        } else if (input > 100) {
            System.out.println("Talet är större än 100");
        }


    }
}
