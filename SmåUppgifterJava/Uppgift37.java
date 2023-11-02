package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift37 {
    public static void main(String[] args) {
        //37.Skapa ett program som läser in hur många tal användaren vill ange. Algoritmen ska sedan
        //läsa in detta antal tal och skriva ut dem.

        //Vi skapar ett objekt av klassen Scanner
        Scanner scan = new Scanner(System.in);

        // Vi anger hur många tal vi vill skriva ut, samt ändrar vår input
        // till int (scan.nextLine ger oss en string, så vi måste parsa den!)
        System.out.print("Hur många tal vill du ange:");
        int iterations = Integer.parseInt(scan.nextLine());

        // Vi fortsätter vår loop så länge i är mindre än iterations ( i < iterations )
        for (int i = 0; i < iterations; i++){
            System.out.println("What number to print?");
            // Vi tar in ett nummer och skriver sedan ut det.
            String numberToPrint = scan.nextLine();
            System.out.println("Number " + (i + 1) + " = " + numberToPrint);
        }
        System.out.println("Number of numbers printed: " + iterations);
    }
}

