package Lektion_4;
import java.util.Scanner;

public class Freier_Fall {
    public static void main(String[] args) throws InterruptedException{
        double Fallbeschleunigung = 9.80665;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Falldauer an");
        int Falldauer = scanner.nextInt();
        double Formel = 0;
        for (int i=1; i <= Falldauer; i++){
            Formel = (1.0/2.0*Fallbeschleunigung*Math.pow(i, 2));
            System.out.println(Formel);
//            Falldauer = Falldauer + 1;
        }
    }
}
