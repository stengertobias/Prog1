package Lektion_9;
import Lektion_10.Student;
public class raum {
    // Attribute
    private String kennung;
    private int maxStudenten;
    private boolean belegt;
    private Student[] studenten;

    // Konstruktor
    public raum(String kennung, int maxStudenten) {
        this.kennung = kennung;
        this.maxStudenten = maxStudenten;
        this.belegt = false;
        this.studenten = new Student[maxStudenten];
    }

    // Getter und Setter
    public String getKennung() {
        return kennung;
    }

    public int getMaxStudenten() {
        return maxStudenten;
    }

    public boolean isBelegt() {
        return belegt;
    }

    // Methoden

    public void belegen() {
        if (!belegt) {
            belegt = true;
            System.out.println("Raum " + kennung + " wurde erfolgreich belegt.");
        } else {
            System.out.println("Raum " + kennung + " ist bereits belegt.");
        }
    }

    public void freigeben() {
        if (belegt) {
            belegt = false;
            System.out.println("Raum " + kennung + " wurde freigegeben.");
        } else {
            System.out.println("Raum " + kennung + " ist bereits frei.");
        }
    }

    public void betreteRaum(Student student) {
        if (!belegt) {
            belegt = true;
        }

        for (int i = 0; i < studenten.length; i++) {
            if (studenten[i] == null) {
                studenten[i] = student;
                System.out.println(student.getVorname() + " " + student.getNachname() + " betritt Raum " + kennung);
                return;
            }
        }

        System.out.println("Der Raum ist bereits voll. " + student.getVorname() + " " + student.getNachname() + " kann nicht eintreten.");
    }

    public void verlasseRaum(Student student) {
        for (int i = 0; i < studenten.length; i++) {
            if (studenten[i] != null && studenten[i].equals(student)) {
                studenten[i] = null;
                System.out.println(student.getVorname() + " " + student.getNachname() + " verlässt Raum " + kennung);
                return;
            }
        }

        System.out.println(student.getVorname() + " " + student.getNachname() + " ist nicht im Raum " + kennung);
    }
}
