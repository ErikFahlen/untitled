package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift22 {
    public static void main(String[] args) {
        //Skapa ett program som testar om ett tal är 0-9 men inte 5. Skriv ut lämplig text.
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett tal: ");
        int input = Integer.parseInt(scan.nextLine());

        if (input <=9 && input >=0 && input!=5){
            System.out.println("Talet är mellan 0-9, men inte 5!");
        } else if (input == 5){
            System.out.println("Talet är 5!");
        }else {
            System.out.println("Talet är inte mellan 0-9");
        }

        }
}

