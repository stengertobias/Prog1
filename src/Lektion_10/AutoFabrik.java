package Lektion_10;
import Lektion_9.auto;

public class AutoFabrik {
    int produzierteAutos = 0;
    auto[] autos;
    public void produziere(String marke, int hubraum, String farbe){
        auto neuesAuto = new auto(marke, hubraum, farbe);
        produzierteAutos++;
        System.out.println(produzierteAutos);
    }


    public static void main(String[] args){
        auto autos1 = new auto("Audi", 1000, "Rot");
        auto autos2 = new auto("BMW", 1200, "Blau");
        System.out.println(auto.produzierteAutos1);
        //autoFabrik.produziere("Audi", 1000, "Rot");
        //autoFabrik.produziere("BMW", 1200, "Blau");
    }
}
