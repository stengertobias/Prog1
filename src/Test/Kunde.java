package Test;

public class Kunde {
    Bestellung[] bestellungen = new Bestellung[49];

    public Bestellung findeBestellung(String in){
        Bestellung bestellungOut = null;
            for (int i = 0; i < 50; i++){
                for (int j = 0; j < 50; j++){
                    if(bestellungen[i].artikelarray[j].getArtikelname().equals(in)){
                        bestellungOut = bestellungen[i];
                        break;
                    }
                }
            }
            return bestellungOut;
    }
}
