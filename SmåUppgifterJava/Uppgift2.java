package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in hur mycket du sålt för: ");
        int addSales = Integer.parseInt(scan.nextLine());
        int baseSalary = 8000;
        double fullSalary = baseSalary + (addSales*0.09);

        System.out.println("Du kommer få " + fullSalary + " denna månad!");

    }
}
