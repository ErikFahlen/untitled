package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in den första siffran: ");
        double numOne = Double.parseDouble(scan.nextLine());
        System.out.print("Skriv in den andra siffran: ");
        double numTwo = Double.parseDouble(scan.nextLine());
        System.out.print("Skriv in den tredje siffran: ");
        double numThree = Double.parseDouble(scan.nextLine());

        double sum = numOne + numTwo + numThree;
        double avg = sum/3;

        System.out.println("Summan blir: " + sum + " och medelvärdet blir: " + avg);
    }
}
