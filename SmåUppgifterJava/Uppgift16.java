package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hur många varor vill du köpa?");
        double produkt = Double.parseDouble(scan.nextLine());
        System.out.print("Vad kostar produkten?");
        double produktPris = Double.parseDouble(scan.nextLine());

        double rabatt = 0.10;
        double sum = produktPris*produkt;
        double sumRabatt = sum - sum*rabatt;

        if (sum>=1000) {
            System.out.println("Totala priset blir: " + sumRabatt);
            System.out.println("Du sparade: " + (sum - sumRabatt));
        } else {
            System.out.println("Totala priset blir: " + sum);
        }

    }
}
