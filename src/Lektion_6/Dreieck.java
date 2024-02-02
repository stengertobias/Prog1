package Lektion_6;

public class Dreieck {
        public static void main(String[] args) {
            dreieckAusgeben(10);
        }


    public static void dreieckAusgeben(int reihen) {
            for (int i = 1; i <= reihen; i++) {
                // Leerzeichen vor den Sternen
                for (int j = 1; j <= reihen - i; j++) {
                    System.out.print(" ");
                }

                // Sterne ausgeben
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");

                    // Leerzeichen zwischen den Sternen
                    if (k < i) {
                        System.out.print(" ");
                    }
                }

                // Neue Zeile für die nächste Reihe
                System.out.println();
            }
        }
    }


