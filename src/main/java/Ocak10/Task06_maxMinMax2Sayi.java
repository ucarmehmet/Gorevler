package Ocak10;

import java.util.Arrays;

public class Task06_maxMinMax2Sayi {
    public static void main(String[] args) {

          /*TASK :
            write a java program to find the second largest number in the array?
            Maximum and minimum number in the array?
            (Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
            bulmak için bir java programi yazin)

            int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

            */

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        int max,min,max2 = 0;
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length-1];
        max2 = arr[arr.length-2];

        System.out.println("Verilen dizideki \n" +
                "Minimum sayı : "+min+"\n" +
                "Maksimum sayı : "+max+"\n" +
                "En büyük ikinci sayı : "+max2);

    }
}
