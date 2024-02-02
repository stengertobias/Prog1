package Lektion_10;

public class UhrTest {
    public static void main(String[] args){
        Uhr[] uhren = new Uhr[24];
        for (int i = 0; i <= 23; i++){
            uhren[i] = new Uhr(i, 23, 7);
            uhren[i].naechsteSek();
            System.out.println(uhren[i].getStd());
            System.out.println(uhren[i].getMin());
            System.out.println(uhren[i].getSek());
        }
    }
}