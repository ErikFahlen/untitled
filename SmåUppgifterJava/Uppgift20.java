package SmåUppgifterJava;
import java.util.Scanner;

public class Uppgift20 {
    public static void main(String[] args) {
        //Skapa ett program som läser in ett tal. Om talet är mellan 0 och 9 ska kvadraten på talet
        //skrivas ut. Annars ska lämpligt felmeddelande ges

        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in ett tal mellan 0-9 du vill räkna ut kvadraten på: ");
        int input = Integer.parseInt(scan.nextLine());
        int square = input*input;

        if (input <=9 && input >=0){
            System.out.println("Kvadraten på " + input + " är lika med: " + square);
        }else {
            System.out.println("Vänligen skriv in en siffra mellan 0-9!");
        }

    }
}
