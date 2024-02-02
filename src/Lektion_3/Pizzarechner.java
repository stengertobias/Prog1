package Lektion_3;

import java.util.Scanner;
public class Pizzarechner {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        double PI = Math.PI;
        System.out.println("Geben Sie den Durchmesser der 1. Pizza an");
        int Pizza1 = Scanner.nextInt();
        System.out.println("Geben Sie den Preis der 1. Pizza an");
        int Preis1 = Scanner.nextInt();
        System.out.println("Geben Sie den Durchmesser der 2. Pizza an");
        int Pizza2 = Scanner.nextInt();
        System.out.println("Geben Sie den Preis der 2. Pizza an");
        int Preis2 = Scanner.nextInt();

        double FlächeP1 = Math.pow(0.5 * Pizza1,2) * PI;
        double FlächeP2 = Math.pow(0.5 * Pizza2,2) * PI;

        double Lohnen1 = FlächeP1 / Preis1;
        double Lohnen2 = FlächeP2 / Preis2;

        if (Lohnen1 > Lohnen2){
            System.out.println("Die 1. Pizza lohnt sich mehr");
        }
        else if (Lohnen2 > Lohnen1){
            System.out.println("Die 2. Pizza lohnt sich mehr");
        }
        else{
            System.out.println("Das Preis/Leistungverhältnis ist gleich");
        }


        System.out.println(FlächeP1);
        System.out.println(FlächeP2);
    }
}