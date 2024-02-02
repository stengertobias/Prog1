package Lektion_10;
import Lektion_9.raum;

public class RaumTest {
    public static void main(String[] args) {
        raum vorlesungsSaal1 = new raum("I1.3", 3);

        Student student1 = new Student("Aaron", "Beispiel1", 12345);
        Student student2 = new Student("Elias", "Beispiel2", 67890);
        Student student3 = new Student("Peter", "Beispiel3", 11111);
        Student student4 = new Student("Lisa", "Beispiel4", 99999);
        Student student5 = new Student("Hans", "Beispiel5", 88888);
        vorlesungsSaal1.betreteRaum(student1);
        vorlesungsSaal1.betreteRaum(student2);
        vorlesungsSaal1.betreteRaum(student3);

        vorlesungsSaal1.betreteRaum(student4);

        vorlesungsSaal1.verlasseRaum(student1);

        vorlesungsSaal1.betreteRaum(student5);
    }
}
