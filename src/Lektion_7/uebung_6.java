package Lektion_7;
public class uebung_6 {
    public static void main(String[] args) {

        int[] lottozahlen = lotto();
        for(int x : lottozahlen){
            System.out.println(x);
        }

    }

    public static int[] lotto(){
        int[] lottopool = new int[49];
        for(int i = 0; i<49; i++){
            lottopool[i] = i+1;
        }

        int[] lottozahlen = new int[6];

        for(int i = 0; i<6; i++){
            lottozahlen[i] = draw(lottopool);
            lottopool = delete(lottopool, lottozahlen[i]);
        }

        return lottozahlen;
    }

    public static int draw(int[] array){
        int x = (int)(Math.random()*array.length);
        int drawn_number = array[x];

        return drawn_number;
    }

    public static int[] delete(int[] array, int x){
        int[] newArray = new int[array.length-1];
        for(int i =0, z=0; i<newArray.length;i++,z++){
            if(i+1==x){
                newArray[i]=z+2;
                z++;
            }
            else{
                newArray[i]=z+1;
            }
        }
        return newArray;
    }

}