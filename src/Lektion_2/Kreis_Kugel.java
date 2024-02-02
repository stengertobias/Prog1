package Lektion_2;

public class Kreis_Kugel
{
        public static void main(String[] args)
        {
            float r = 4.00f;
            final float PI = 3.1415f;
            float Flaeche = PI * (r *r);
            float Umfang = 2 * PI * r;
            float Volumen = (4.0f / 3) * PI * (r * r * r);
            System.out.println("Die Kreisfläche beträgt " + Flaeche);
            System.out.println("Der Kreisumfang beträgt " + Umfang);
            System.out.println("Das Volumen der Kugel beträgt " + Volumen);
        }
}
