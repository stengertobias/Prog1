package Lektion_3;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein");
        int x = Scanner.nextInt();
        int Ergebnis = x % 7;
        if (Ergebnis == 0) {
            System.out.println("Die Zahl " + x + " ist ganzzahlig durch 7 teilbar");
        }
        else {
            System.out.println("Rest " + Ergebnis);
        }

    }
}
