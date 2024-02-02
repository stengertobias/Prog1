package Lektion_5;

public class  Reihenwerte {
    public static void main(String[] args){
        double summe = 0;
        double summand;
        int k = 1;

        do {
            summand = 6*(1.0/Math.pow(k,2));
            summe=summe+summand;
            System.out.println(summe);
            k++;
        }
        while (summand > 1E-5);

    }
}
