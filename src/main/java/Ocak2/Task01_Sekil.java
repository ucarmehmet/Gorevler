package Ocak2;

import java.util.Scanner;

public class Task01_Sekil {
    public static void main(String[] args) {

        /* TASK : aşagıdaki şekli console'a yazdırınız
         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır ve sütun sayısını belirtir bir sayı giriniz : ");
        byte sayi = input.nextByte();

        for (int i = 1; i <=sayi ; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
