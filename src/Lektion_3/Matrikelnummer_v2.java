package Lektion_3;
import java.util.Scanner;
public class Matrikelnummer_v2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Matrikelnummer ein");
        int Matrikelnummer = scanner.nextInt();

        if (((Matrikelnummer >= 5000000) && (Matrikelnummer <= 5199999)) || ((Matrikelnummer >= 6100000) && (Matrikelnummer <= 6199999))) {
            System.out.println("Die Matrikelnummer ist gültig");
        }
            else {
                System.out.println("Die Matrikelnummer ist ungültig");
        }

    }
}
