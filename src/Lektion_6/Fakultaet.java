package Lektion_6;
import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();

        if (zahl < 0) {
            System.out.println("Fakultät ist für negative Zahlen nicht definiert.");
        } else {
            long fakultaet = berechneFakultaet(zahl);
            System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);
        }
    }

    public static long berechneFakultaet(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * berechneFakultaet(n - 1);
        }
    }
}