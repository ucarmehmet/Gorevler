package Ocak10;

import java.util.Arrays;

public class Task12_mDArrayIcElemanlarToplam {
    public static void main(String[] args) {

        /* Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
        toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
         ve yeni array’i ekrana yazdıran bir program yazınız
         Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}
        */

        int[][] mDArray = { {1,2,3}, {4,5}, {6,7} };
        int[] Array = new int[mDArray.length];
        int sum = 0;
        int i = 0;
        for (int[] w : mDArray){
            for (int k : w){
                sum += k;
            }
            Array[i] = sum;
            sum = 0;
            i++;
        }
        System.out.println("Verilen "+Arrays.deepToString(mDArray) + " multi dimensional array’in \n" +
                "iç array elemanları toplanarak oluşturulan yeni Array : " + Arrays.toString(Array));
    }
}
