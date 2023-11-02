package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift38 {
    public static void main(String[] args) {
        //En kommun har gjort följande prognos för befolkningsutvecklingen de närmaste åren: -
        //Vid början av 2016 hade kommunen 26000 invånare.
        //- Antalet födda och avlidna under ett år uppskattas var 0.7 % resp 0.6 % av
        //befolkningen vid årets början.
        //- Antalet inflyttade och antalet utflyttade uppskattas till 300 resp 325 varje år.
        //Skapa ett program som beräknar kommunens uppskattade invånarantal i början av ett visst
        //år. Vilket år det gäller ska läsas in som indata till algoritmen.

        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in ett årtal: ");
        int whatYear = Integer.parseInt(scan.nextLine());

        double currentHabitants = 26000;
        double peopleDead = currentHabitants * 0.06;
        double peopleBorn = currentHabitants * 0.07;
        double peopleMovedIn = 300;
        double peopleMovedOut = 325;

        if (whatYear>2016){
            for (int i=2016;whatYear>i;i++){
                currentHabitants = currentHabitants + peopleMovedIn - peopleMovedOut - peopleDead + peopleBorn;
                System.out.println("Året: " + (i+1) + " beräknas kommunen ha " + currentHabitants + " invånare!");
                //Antalet ökar med 235 per år
            }

        }else if (whatYear<2016) {
            for (int i=2016;whatYear<i;i--){
                currentHabitants = currentHabitants - peopleMovedIn + peopleDead - peopleBorn;
                System.out.println("Året: " + (i-1) + " beräknas kommunen ha " + currentHabitants + " invånare!");
                //Antalet minskar med 560 per år
            }
        }
    }
}
