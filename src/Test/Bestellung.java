package Test;

public class Bestellung {
    int bestellnummer;
    Artikel[] artikelarray = new Artikel[49];

    public Bestellung (int bestellnummer){
        this.bestellnummer = bestellnummer;
    }

    public void einfuegen(Artikel in){
        for (int i = 0; i < 50; i++){
            if (artikelarray[i] == null){
                artikelarray[i] = in;
                break;
            }
        }
    }

    //Methodensignatur: public ... loeschen(Artikel zuLoeschenderArtikel)
    //Rückgabetyp: void
}
