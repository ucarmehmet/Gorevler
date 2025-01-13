package Ocak10;

import java.util.Arrays;

public class Task10_stringDegistir {
    public static void main(String[] args) {

        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String vStr = "GayetBasarılı";
        String yStr = "ÇoookBasarılı";
        String[] strDizi = vStr.split("");
        String[] yDizi = yStr.split("");

        int dSonIndex = vStr.split("B")[0].length()-1;
        for (int i = 0; i < dSonIndex; i++) {
            if(i == 0){
                yDizi[i] = "Ç";
            }else if (i == dSonIndex){
                yDizi[i] = "k";
            }else {
                yDizi[i] = "o";
            }
        }
        System.out.println(Arrays.toString(strDizi));
        System.out.println(Arrays.toString(yDizi));

    }
}
