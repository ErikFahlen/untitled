package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv grader i Fahrenheit: ");
        double fahrenHeit = Double.parseDouble(scan.nextLine());

        double celsius = (fahrenHeit-32)*5/9;

        System.out.println(fahrenHeit + " grader i Fahrenheit blir " + celsius + " grader i celsius");

    }
}
