package Lektion_6;

import java.util.Scanner;
public class RundenAufAb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Kommazahl ein.");
        double zahl = scanner.nextDouble();
        System.out.println("Geben Sie die Stelle ein auf die gerundet werden soll.");
        long nachkommastelle = scanner.nextInt();
        double gerundet = genauRunden(zahl, nachkommastelle);
        System.out.println(zahl + " wird auf- oder abgerundet zu " + gerundet);


    }

    public static int rundeAufAb(double zahl) {
        int ganzzahligerTeil = (int) zahl;
        double dezimalteil = zahl - ganzzahligerTeil;

        if (dezimalteil >= 0.5) {
            return ganzzahligerTeil + 1;
        } else {
            return ganzzahligerTeil;
        }
    }

    public static double genauRunden(double zahl, long nachkommastelle) {
        double multiplikator = 1;
        for (int i = 1; i <= nachkommastelle; i++){
            multiplikator *= 10;
        }
        double ganzzahligerTeil2 = (int) (zahl * multiplikator);
        return ganzzahligerTeil2 / multiplikator;
    }
}
