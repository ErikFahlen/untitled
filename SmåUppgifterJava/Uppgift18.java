package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in värdet för x: ");
        int x = Integer.parseInt(scan.nextLine());
        System.out.print("Skriv in värdet för y: ");
        int y = Integer.parseInt(scan.nextLine());

        int a;

        if (x>5+y){
            a = 2;
            System.out.println("A är lika med: " + a);
        } else {
            a = 5;
            System.out.println("A är lika med: " + a);
        }
    }
}
