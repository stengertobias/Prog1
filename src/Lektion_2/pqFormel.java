package Lektion_2;

public class pqFormel {
    public static void main(String[] args) {

        int p = 4;
        int q = 3;

        System.out.println(p + " " + q);

        double diskriminante = Math.pow((p / 2.0), 2) - q;
        System.out.println(diskriminante);

        if (diskriminante > 0) {
            double x1 = (-(p / 2.0)) + Math.sqrt(diskriminante);
            double x2 = (-(p / 2.0)) - Math.sqrt(diskriminante);

            System.out.println("x1=" + x1 + " und x2=" + x2);
        } else if (diskriminante == 0) {
            double x = (-(p / 2.0));
            System.out.println("Es gibt nur eine Lösung mit x=" + x);
        } else {
            System.out.println("Ungültige Zahlen");
        }
    }
}