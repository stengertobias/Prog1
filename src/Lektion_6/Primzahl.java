package Lektion_6;
import java.util.Scanner;
public class Primzahl {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein");
        int zahl = input.nextInt();
        boolean istPrimzahl = checkPrimzahl(zahl);

            if (istPrimzahl = true) {
                System.out.println(zahl + " ist eine Primzahl");
            }
                else {
                    System.out.println(zahl + " ist keine Primzahl");
            }
    }

    public static boolean checkPrimzahl(int zahl){
        if (zahl <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(zahl); i++) {
            if (zahl % i == 0) {
                return false;
            }
        }

        return true;
    }
}
