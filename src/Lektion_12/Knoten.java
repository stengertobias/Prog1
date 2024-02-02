package Lektion_12;

public class Knoten {
    String wort;
    String bedeutung;
    Knoten left;
    Knoten right;

    public Knoten (String wort){
        this.wort = wort;
    }

    public Knoten (String wort, String bedeutung)
    {
        this.wort = wort;
        this.bedeutung = bedeutung;
    }

    public String getWort(){
        return wort;
    }

    public String getBedeutung(){
        return bedeutung;
    }

    public void setBedeutung(String b){
        bedeutung = b;
    }
}
