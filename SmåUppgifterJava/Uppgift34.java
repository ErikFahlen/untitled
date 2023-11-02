package SmåUppgifterJava;
import java.util.Scanner;
public class Uppgift34 {


    public class Main {
        public static void main(String[] args) {
            //34.Skapa ett program som läser in och skriver ut ett tecken i taget tills en * skrivs in.
            Scanner scan = new Scanner(System.in);

            //Vi kör en while loop tills något avbryter den, om vi inte använder break så kommer
            //loopen fortsätta för evigt!
            while (true) {
                System.out.println("Skriv något för att repetera det!");
                System.out.println("Eller skriv * för att avsluta!");
                String input = scan.nextLine();
                //Vi använder.equals för att kontrollera innehållet i en String!
                if (input.equals("*")){
                    System.out.println("Quitting!");
                    //Vi bryter oss ur loopen med hjälp av break;
                    break;
                }

                System.out.println("Du skrev: " + input);
            }

            String input = "";
            // Vi undersöker att input INTE är lika med *
            // Om den är lika med * så avslutas while loopen!
            while (!input.equals("*")){
                System.out.println("Skriv något för att repetera det!");
                System.out.println("Eller skriv * för att avsluta!");
                input = scan.nextLine();
                System.out.println("Du skrev: " + input);
            }
            // Vi kontrollerar att input2 INTE är lika med ett
            // Om vi skriver ett så avslutas loopen!
            int input2 = 0;
            while (input2 != 1){
                System.out.println("Skriv ett nummer för att repetera det!");
                System.out.println("Eller skriv 1 för att avsluta!");
                input2 = Integer.parseInt(scan.nextLine());
                System.out.println("Du skrev: " + input2);

            }
        }
    }
}
