package Ocak10;

import java.util.Arrays;
import java.util.Scanner;

public class Task01_arrayOlusturmaDegerGirme {
    public static void main(String[] args) {

        /* TASK :
     kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
     ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
     java code create ediniz.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaç elemanlı dizi oluşturmak istiyorsanız sayısını giriniz : ");
        int diziEleman = input.nextInt();
        int[] myArray = new int[diziEleman];
        int i = 1;
        while (diziEleman != 0 && i-1 != diziEleman){
            System.out.println("Lütfen " + i + ". elamanı giriniz : ");
            myArray[i-1] = input.nextInt();
            i++;
        }
        Arrays.sort(myArray);

        System.out.println(myArray[myArray.length-1] - myArray[0]);
    }
}
