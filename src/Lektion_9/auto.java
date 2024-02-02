package Lektion_9;

public class auto {
    public static int produzierteAutos1 = 0;
    //Atribute
    String marke;
    int hubraum;
    String farbe;

    //Methoden
    public String getMarke(){
        return marke;
    }

    public int getHubraum(){
        return hubraum;
    }

    public String getFarbe(){
        return farbe;
    }

    public void setHubraum(int h){
        if (h > 0) {
            hubraum = h;
        }
        else {
            hubraum = 1600;
        }
    }


    public auto(String marke, int hubraum, String farbe) {
        this.marke = marke;
        this.hubraum = hubraum;
        this.farbe = farbe;
        produzierteAutos1++;
    }
}

