package Lektion_1;

public class Tausch
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 7;
        //Vor dem Lektion_1.Tausch
        System.out.println(x);
        System.out.println(y);
        //Lektion_1.Tausch
        int temp = x;
        x = y;
        y = temp;
        //Nach dem Lektion_1.Tausch
        System.out.println(x);
        System.out.println(y);
    }
}