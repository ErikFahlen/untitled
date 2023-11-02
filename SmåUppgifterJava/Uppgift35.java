package SmåUppgifterJava;

import java.util.Scanner;

public class Uppgift35 {
    public static void main(String[] args) {
        //.Skapa ett program som beräknar och skriver ut kvadraterna för talen 1 till 9
        Scanner scan = new Scanner(System.in);

        for (int i=0;i<=9;i++){
            int square = i*i;
            System.out.println("Kvadraten på " + i + " är like med: " + square);
        }
    }
}
