package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift36 {
    public static void main(String[] args) {
        //Skapa ett program som räknar ut hur mycket man har på banken under vart och ett av de
        //följande 10 åren om man sätter in 1000 kr. Räntan ska läsas in och är densamma för alla
        //åren.
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in räntan: ");
        double interest = Double.parseDouble(scan.nextLine());

        double deposit = 1000;
        int year = 10;







        for (int i=1;i<=year;i++){
            deposit = deposit * (1 + interest);
            System.out.println("Totala summan på banken år " + i +" är: " + deposit);

        }
    }
}
