package Lektion_8;
import java.util.Scanner;
public class galgenmaenchen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl von 1-20 ein");
        int auswahl = input.nextInt();
        String wort1 = auswahl(auswahl);
//        System.out.println(wort1);
//        System.out.println(blank123);
       spiel(wort1);

    }

    public static String auswahl(int wahl) {
        String wort = "";
        switch (wahl) {
            case 1 -> wort = "JAVA";
            case 2 -> wort = "SPRACHE";
            case 3 -> wort = "LEBEN";
            case 4 -> wort = "REDBULL";
            case 5 -> wort = "SPIEL";
            case 6 -> wort = "STUDIUM";
            case 7 -> wort = "BIERDECKEL";
            case 8 -> wort = "WEIHNACHTEN";
            case 9 -> wort = "KINDERGELD";
            case 10 -> wort = "PROGAMMIERSPRACHE";
            case 11 -> wort = "DEFAULT";
            case 12 -> wort = "LATERNOS";
            case 13 -> wort = "SWITCH";
            case 14 -> wort = "NINTENDO";
            case 15 -> wort = "SMARTPHONE";
            case 16 -> wort = "PROGRAMMIEREN";
            case 17 -> wort = "DARTSCHEIBE";
            case 18 -> wort = "SNAPCHAT";
            case 19 -> wort = "TWITTER";
            case 20 -> wort = "WHATSAPP";
            default -> System.out.println("Es wurde keine Zahl zwischen 1 und 20 ausgewählt");
        }
        return wort;
    }


    public static String wortBlanken(String x) {
        char[] wort = x.toCharArray();
        String blank = "";
        for (int i = 0; i < wort.length; i++) {
            blank += "_";
        }
        return blank;
    }

    public static boolean spiel(String wort) {
        Scanner userinput = new Scanner(System.in);
        String blank = wortBlanken(wort);
        char[] charBlank = blank.toCharArray();
        String test = "";
        char[] loesung = wort.toCharArray();

            for (int i = 1; i <= 15; i++) {
                System.out.println(charBlank);
                System.out.println("Geben Sie eine Buchstaben ein. Das ist Ihr " + i + ".Versuch");
                String eingabe = userinput.nextLine();;
                char buchstabe = eingabe.charAt(0);

                    if ((buchstabe >= 'a') && (buchstabe <= 'z')) {
                        buchstabe = (char) (buchstabe - 32);
                        }

                        for (int j = 0; j < loesung.length; j++){
                            if (buchstabe == loesung[j]){
                            charBlank[j] = buchstabe;
                                }
                            }

                                if (charBlank.equals(loesung)){
                                System.out.println("Sie haben das Wort erraten");
                                return true;
                            }
                    }
        System.out.println("Sie haben Ihre Versuche aufgebraucht");
        return false;
    }
}