package Lektion_5;
import java.util.Scanner;
class Summieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl ein");
        int zahl = 0;
        int summe = 0;
        do{
            zahl = scanner.nextInt();
            summe= summe + zahl;
        } while(zahl!=0);
        System.out.println(summe);
    }
}