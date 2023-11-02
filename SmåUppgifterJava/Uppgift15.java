package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift15 {
    public static void main(String[] args) {

        // Inte lyckats med
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in det första talet: ");
        int numOne = Integer.parseInt(scan.nextLine());
        System.out.print("Skriv in det andra talet: ");
        int numTwo = Integer.parseInt(scan.nextLine());
        int numThree = numOne/numTwo;

        if (numThree % 2 == 0){
            System.out.println("Jämnt delbart");
        } else {
            System.out.println("Inte jämnt delbart");
        }
    }
}
