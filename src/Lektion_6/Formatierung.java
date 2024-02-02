package Lektion_6;
import java.util.Scanner;

public class Formatierung {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Vornamen an");
        String firstName = input.nextLine();
        System.out.println("Geben Sie Ihren Nachnamen an");
        String lastName = input.nextLine();
        System.out.println("Geben Sie Ihre Matrikelnummer an");
        String matrikelnummer = input.nextLine();
        System.out.println("Geben Sie Ihre e-Mail an");
        String email = input.nextLine();

        String namenFormatiert = formatName(lastName, firstName);
        String matrikelnummerFormatiert = formatNameWithMatriculationNr(lastName, firstName, matrikelnummer);
        String emailFormatiert = formatNameWithMatriculationNrAndEmail(lastName, firstName, matrikelnummer, email);

        System.out.println(namenFormatiert);
        System.out.println(matrikelnummerFormatiert);
        System.out.println(emailFormatiert);
    }

    public static String formatName(String lastName, String firstName){
        return (lastName + ", " + firstName);
    }

    public static String formatNameWithMatriculationNr(String lastName, String firstName, String matrikelnummer) {
        return formatName(lastName, firstName) + " (" + matrikelnummer + ")";
    }

    public static String formatNameWithMatriculationNrAndEmail(String lastName, String firstName, String matrikelnummer, String email) {
        return formatNameWithMatriculationNr(lastName, firstName, matrikelnummer) + " " + email;
    }
}
