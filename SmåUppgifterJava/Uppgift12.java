package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in det första talet: ");
        int numOne = Integer.parseInt(scan.nextLine());
        System.out.print("Skriv in det andra talet: ");
        int numTwo = Integer.parseInt(scan.nextLine());

        if (numOne>numTwo*2) {
            System.out.println("För stort");
        } else {
            System.out.println("För litet");
        }
    }
}
