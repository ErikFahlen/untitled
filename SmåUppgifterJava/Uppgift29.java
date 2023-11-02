package SmåUppgifterJava;

public class Uppgift29 {
    public static void main(String[] args) {

        // Vi anger vilken tid vi avgår från stationen
        int departureTimeHour = 23;
        int departureTimeMinutes = 30;
        // Vi anger vår resetid!
        int travelTimeHours = 2;
        int travelTimeMinutes = 30;

        int arrivalTimeHours = departureTimeHour + travelTimeHours;
        int arrivalTimeMinutes = departureTimeMinutes + travelTimeMinutes;

        // VI måste på något sätt simulera att minuter max kan vara 60 och timmar max 24
        if (arrivalTimeMinutes >= 60) {
            //Om mängden är lika med eller överstiger 60 så ökar vi antal timmar med 1
            arrivalTimeHours++;
            // Om vi ökar timmar med 1 så tar vi bort 60 minuter
            arrivalTimeMinutes -= 60;
        }

        if (arrivalTimeHours >= 24) {
            arrivalTimeHours = arrivalTimeHours - 24;
            System.out.println("Vi ankommer till stationen " + arrivalTimeHours + ":" + arrivalTimeMinutes + " Nästa dag");
        } else {
            System.out.println("Vi ankommer till stationen " + arrivalTimeHours + ":" + arrivalTimeMinutes);

        }

    }
}