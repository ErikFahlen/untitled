package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift28 {
    public static void main(String[] args) {

        //Skapa ett program som läser in en temperatur. Om temperaturen är mellan 18 och
        //25 grader ska meddelandet “Lagom temp“ skrivas ut. Om det är varmare än 25grader ska
        //“För varmt“ skrivas ut och om det är kallare än 18grader ska “För kallt“ skrivas ut.
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in en temperatur: ");
        int temp = Integer.parseInt(scan.nextLine());

        if (temp <= 25 && temp >=18){
            System.out.println("Lagom temp");
        } else if (temp >25) {
            System.out.println("För varmt");
        } else if (temp <= 17) {
            System.out.println("För kallt");
        }


    }
}
