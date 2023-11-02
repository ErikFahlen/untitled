package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift21 {
    public static void main(String[] args) {

        //Skapa ett program som testar om ett tal är mindre än -10 eller större än +10. I så fall ska ett
        //lämpligt meddelande ges.

        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in ett tal: ");
        int input = Integer.parseInt(scan.nextLine());

        if (input < -10 || input > 10) {
            System.out.println("Talet är mindre än -10 eller större än 10!");
        } else {
            System.out.println("Talet är mellan -10 och 10!");
        }

    }
}
