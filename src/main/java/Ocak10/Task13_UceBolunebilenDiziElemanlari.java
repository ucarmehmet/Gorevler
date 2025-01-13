package Ocak10;

import java.util.Arrays;
import java.util.Scanner;

public class Task13_UceBolunebilenDiziElemanlari {
    public static void main(String[] args) {

         /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */

        Scanner input = new Scanner(System.in);
        int[] Array = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Lütfen dizinin " + (i+1) +". elemanını giriniz.");
            Array[i] = input.nextInt();
        }
        System.out.println("Girdiğiniz sayılar : " + Arrays.toString(Array));
        int sayi = 0;
        for(int w : Array){
            if (w % 3 == 0){
                sayi ++;
            }
        }
        System.out.println("Verdiğiniz sayılardan "+ sayi + " adedi 3 e tam bölünebilen sayılardır.");
    }
}
