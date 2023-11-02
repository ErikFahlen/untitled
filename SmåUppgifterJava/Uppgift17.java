package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in det första talet: ");
        double numOne = Double.parseDouble(scan.nextLine());
        System.out.print("Skriv in det andra talet: ");
        double numTwo = Double.parseDouble(scan.nextLine());

        double sum = numOne/numTwo;

        if (numTwo == 0) {
            System.out.println("Nämnaren får inte vara 0!");
        } else {
            System.out.println("Kvoten blir: " + sum);
        }
    }
}
