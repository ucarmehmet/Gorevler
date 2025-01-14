package Ocak10;

import java.util.Arrays;
import java.util.Scanner;

public class Task02_mDicToplam {
    public static void main(String[] args) {

        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

         */

        int[][] myArray = {{10,20,30},{4},{6,7,20}};
        int[] newArray = new int[myArray.length];
        int i = 0;
        int sum = 0;
        for (int[] w : myArray){
            for (int k : w){
                sum = sum+k;
            }
            newArray[i] = sum;
            sum = 0;
            i++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
