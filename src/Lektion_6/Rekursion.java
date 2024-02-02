package Lektion_6;
public class Rekursion {
    public static void main(String[] args) {
        System.out.println(exponentUndZahl(4, 2));     }
    public static int exponentUndZahl(int zahl, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        else {
            zahl = zahl * exponentUndZahl(zahl, exponent-1);
        }             return zahl;
    }
}