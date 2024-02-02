package Lektion_5;

import java.util.Scanner;
public class Potenz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Basis an");
        double b = scanner.nextDouble();
        System.out.println("Geben Sie einen Exponent an");
        int n = scanner.nextInt();
        double produkt = 1;

            for (int i = 1; i <= n; i++){
                produkt = produkt * b;
                System.out.println(produkt);
            }


    }
}
