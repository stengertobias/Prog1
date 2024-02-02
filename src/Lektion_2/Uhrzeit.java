package Lektion_2;

import java.time.LocalTime;

public class Uhrzeit {

    public static void main(String[] args) {
        int stunden = 12;
        int minutes = 30;
        int sekunden= 0;


        int stundenAktuell = LocalTime.now().getHour();
        int minutenAktuell = LocalTime.now().getMinute();
        int sekundenAktuell = LocalTime.now().getSecond();

        int SeksNachMitternacht = stunden * 60 * 60 + minutes * 60 + sekunden;
        int SeksNachMitternachtAktuell = stundenAktuell * 60 * 60 + minutenAktuell * 60 + sekundenAktuell;

        int SeksGanzerTag = 24 * 60 * 60;

        int SeksRest = SeksGanzerTag - SeksNachMitternacht;
        int SeksRestAktuell = SeksGanzerTag - SeksNachMitternachtAktuell;

        System.out.println(SeksNachMitternacht);
        System.out.println(SeksRest);
        System.out.println(SeksNachMitternachtAktuell);
        System.out.println(SeksRestAktuell);

        float Prozent = (float) SeksNachMitternacht / SeksGanzerTag * 100;
        float ProzentAktuell = (float) SeksNachMitternachtAktuell / SeksGanzerTag * 100;
        System.out.println(Prozent);
        System.out.println(ProzentAktuell);
    }
}

