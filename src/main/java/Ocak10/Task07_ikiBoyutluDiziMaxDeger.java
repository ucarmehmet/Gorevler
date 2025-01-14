package Ocak10;

import java.util.Arrays;

public class Task07_ikiBoyutluDiziMaxDeger {
    public static void main(String[] args) {

        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 8
         */

        int[][] input = {{1,2,-3},{41,55},{-61,-17,80}};
        int max = 0;
        for (int[] w : input){
            for (int i = 0; i < w.length; i++) {
                if (w[i] > max){
                    max = w[i];
                }
            }
        }
        System.out.println("Verilen 2 boyutlu "+ Arrays.deepToString(input) +" dizisindeki en büyük değer : " + max);
    }
}
