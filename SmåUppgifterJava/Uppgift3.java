package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in antal timmar: ");
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = hours * 60;
        int seconds = minutes * 60;

        System.out.println(hours + " timmar blir i minuter: " + minutes + " och i sekunder blir det: " + seconds);
    }
}
