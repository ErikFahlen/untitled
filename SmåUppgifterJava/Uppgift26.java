package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift26 {
    public static void main(String[] args) {

        //26.Skapa ett program som läser in två tal och skriver ut det största talet följt av orden “är störst
        //“. Om talen är lika ska “Talen är lika“ skrivas ut.
        Scanner scan = new Scanner(System.in);


        System.out.print("Skriv in två tal! ");
        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());

        if (numOne > numTwo ) {
            System.out.println(numOne + " är störst!");
        } else if (numTwo > numOne) {
            System.out.println(numTwo + " är störst!");
        }

        if (numTwo == numOne) {
            System.out.println("Talen är lika!");
        }
    }
}
