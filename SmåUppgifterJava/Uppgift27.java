package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //.Skapa ett program som läser in tre tal och avgör vilket tal som är minst. Resultatet ska
        //skrivas ut.

        System.out.println("Skriv in tre tal!");
        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());
        int numThree = Integer.parseInt(scan.nextLine());

        if (numOne < numTwo && numOne < numThree) {
            System.out.println(numOne + " är minst");
        } else if (numTwo < numOne && numTwo < numThree) {
            System.out.println(numTwo + " är minst");
        } else if (numThree < numOne && numThree < numTwo) {
            System.out.println(numThree + " är minst");
        }
    }
}
