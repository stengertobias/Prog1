package Lektion_3;
import java.util.Scanner;
public class Matrikelnummer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Matrikelnummer ein");
        String Matrikelnummer = scanner.nextLine();

            if (!(Matrikelnummer.length() == 7)) {
                System.out.println("Die Matrikelnummer ist NICHT gültig");
            }
                 else if ((Matrikelnummer.charAt(0) == '5' && Matrikelnummer.charAt(1) == '0') || (Matrikelnummer.charAt(0) == 5 && Matrikelnummer.charAt(1) == '1') || (Matrikelnummer.charAt(0) == '6' && Matrikelnummer.charAt(1) == '1')){
                    System.out.println("Die Matrikelnummer ist gültig");
                }
                    else {
                        System.out.println("Die Matrikelnummer ist NICHT gültig");
                }
    }
}
