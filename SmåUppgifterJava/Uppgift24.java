package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift24 {
    public static void main(String[] args) {

        //Skapa ett program som läser in kroppstemperaturen och skriver ut ett lämpligt meddelande
        //om temperaturen är mindre än 35 grader eller större än 42 grader
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in din kroppstemperatur: ");
        int bodyTemp = Integer.parseInt(scan.nextLine());

        if (bodyTemp <=35 || bodyTemp >=42) {
            System.out.println("Du borde åka till sjukhus, NU!");
        } else if (bodyTemp >=39 && bodyTemp <=42) {
            System.out.println("Du har feber");
        } else if (bodyTemp <=38 && bodyTemp >=36) {
            System.out.println("Du har en normal kroppstemperatur!");
        }


    }
}
