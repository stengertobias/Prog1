package Lektion_3;
import java.util.Scanner;

public class Char{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Einzelzeichen ein.");
        String Eingabe =  scanner.nextLine();

        if (Eingabe.length() != 1){
            System.out.println ("Ungültige Eingabe. Das Programm wird beendet.");
            System.exit(0);
        }

        if ((Eingabe.charAt(0) >= 'A') && (Eingabe.charAt(0) <= 'Z')){
            System.out.println("Großbuchstabe");
        }
        if ((Eingabe.charAt(0) >= 'A' && Eingabe.charAt(0) <= 'F') || (Eingabe.charAt(0) >= 'a' && Eingabe.charAt(0) <= 'f') || (Eingabe.charAt(0) >= '0' && Eingabe.charAt(0) <= '9')){
            System.out.println("Hexadezimale Ziffer");
        }
        if ((Eingabe.charAt(0) == '0') || (Eingabe.charAt(0) == '1')){
            System.out.println("Binäre Ziffer");
        }
        if ((Eingabe.charAt(0) >= '0') && (Eingabe.charAt(0) <= '8')){
            System.out.println("Oktale Ziffer");
        }
    }
}