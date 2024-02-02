package Lektion_3;

import java.util.Scanner;

public class Einzelzeichen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie ein Einzelzeichen ein: ");
        char zeichen = scanner.next().charAt(0);

        if (Character.isUpperCase(zeichen)) {
            System.out.println("Großbuchstabe");
        }

        if (Character.isDigit(zeichen)) {
            if (zeichen >= '0' && zeichen <= '9') {
                System.out.println("Dezimale Ziffer");
            }
            if ((zeichen >= 'a' && zeichen <= 'f') || (zeichen >= 'A' && zeichen <= 'F')) {
                System.out.println("Hexadezimale Ziffer");
            }
            if (zeichen >= '0' && zeichen <= '1') {
                System.out.println("Binäre Ziffer");
            }
            if (zeichen >= '0' && zeichen <= '7') {
                System.out.println("Oktale Ziffer");
            }
        }

        if (!(Character.isUpperCase(zeichen) || Character.isDigit(zeichen))) {
            System.out.println("Unbekannt");
        }
    }
}
