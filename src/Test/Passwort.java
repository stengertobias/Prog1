package Test;

public class Passwort {
    char[] passwort;

    public Passwort(char[] pw){
        if (alsPWgeeignet(pw) == true) {
            this.passwort = pw;
        } else {
            this.passwort = null;
        }
    }

    public boolean alsPWgeeignet(char[] passwort_in){
        boolean geeignet = false;
        int g = 0;
        int k = 0;
        int z = 0;
        for (int i = 0; i < passwort_in.length; i++){
            if (passwort_in[i] >= 'A' && passwort_in[i] <= 'Z'){
                g = g + 1;
            }
            else if (passwort_in[i] >= 'a' && passwort_in[i] <= 'z'){
                k = k + 1;
            }
            else if (passwort_in[i] >= '0' && passwort_in[i] <= '9'){
                z = z + 1;
            }
        }
        if (g >= 2 && k >= 2 && z >= 2){
            geeignet = true;
        }
        return geeignet;
    }
}
