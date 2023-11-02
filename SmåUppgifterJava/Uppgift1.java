package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in ett tal du vill ha kvadraten på: ");

        int number = Integer.parseInt(scan.nextLine());
        int numberTwo = number * number;

        System.out.println("Kvadraten blir: " + numberTwo);
    }
}
