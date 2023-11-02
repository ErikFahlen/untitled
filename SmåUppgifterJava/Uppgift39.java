package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift39 {
    public static void main(String[] args) {
        //Skapa ett program som läser in ett pris exkl moms och skriver ut priset inkl 25 % moms.
        //Inläsningen ska pågå tills 0 anges
        Scanner scan = new Scanner(System.in);

        double moms = 0.25;

        while (true) {
            System.out.println("Skriv in ett pris exklusive moms! (Skriv in 0 för att avsluta)");
            double prisUtanMoms = scan.nextDouble();

            if (prisUtanMoms == 0) {
                break;
            }

            double prisMedMoms = prisUtanMoms * (1 + moms);
            System.out.println("Priset inklusive 25% mombs blir: " + prisMedMoms);
        }

    }
}
