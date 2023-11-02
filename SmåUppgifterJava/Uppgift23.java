package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift23 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double number = Double.parseDouble(scan.nextLine());
            if (number % 3 == 0 && number % 30 !=0) {
                System.out.println("Vi dividerar med 3 och får :" + (number/3));
            } else {
                System.out.println("Inte jämnt delbart");
            }

        }


}
