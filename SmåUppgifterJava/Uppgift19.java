package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift19 {
    public static void main(String[] args) {

        //En anställd som har timlön får, när arbetstiden överstiger 40 tim en vecka,
        //övertidsbetalning för tiden utöver 40 tim med 1½ tim. Skapa ett program som läser in
        //en anställds timlön och en veckas arbetstid. Den totala veckolönen ska beräknas och
        //skrivas ut.
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in hur många timmar du har jobbat denna vecka: ");
        double hourWork = Double.parseDouble(scan.nextLine());
        double hourPay = 150;

        if (hourWork>40) {
            double overtimeHours = hourWork - 40;
            overtimeHours = hourWork + (overtimeHours *1.5);
            System.out.println("Din totala lön är: " + (overtimeHours * hourPay));
        } else {
            System.out.println("Din totala lön är: " + (hourPay * hourWork));
        }

    }
}
