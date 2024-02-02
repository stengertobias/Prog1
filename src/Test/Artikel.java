package Test;

public class Artikel {
    private int artikelnummer;
    private String artikelname;

    public Artikel(int artikelnummer, String artikelname){
        this.artikelnummer= artikelnummer;
        this.artikelname = artikelname;
    }

    public void setArtikelnummer (int aNr){
        artikelnummer = aNr;
    }

    public int getArtikelnummer(){
        return artikelnummer;
    }

    public void setArtikelname(String aName){
        artikelname = aName;
    }

    public String getArtikelname(){
        return artikelname;
    }
}
