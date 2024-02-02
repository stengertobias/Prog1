package Lektion_10;

public class Uhr {
    public int std;
    public int min;
    public int sek;

    public Uhr(int std, int min, int sek) {
        if ((std >= 0 && std <= 23) && (min >= 0 && min <= 59) && (sek >= 0 && sek <= 59)) {
            this.std = std;
            this.min = min;
            this.sek = sek;
        } else {
            this.std = 12;
            this.min = 0;
            this.sek = 0;
        }

    }

    public int getStd() {
        return std;
    }

    public int getMin() {
        return min;
    }

    public int getSek() {
        return sek;
    }

    public void setUhr(int std, int min, int sek) {
        if ((std >= 0 && std <= 23) && (min >= 0 && min <= 59) && (sek >= 0 && sek <= 59)) {
            this.std = std;
            this.min = min;
            this.sek = sek;
        } else {
            System.out.println("Falsche Angaben bei der Uhrzeit");
            return;
        }
    }

    public void naechsteSek() {
        sek++;
        if (sek == 60) {
            sek = 0;
            min++;
            if (min == 60) {
                min = 0;
                std = std + 1;
            }
        }

    }

}