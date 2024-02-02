package Lektion_10;

public class Student {
    private String vorname;
    private String nachname;
    private int matrikelnummer;

    public Student(String vorname, String nachname, int matrikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnummer = matrikelnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }
}