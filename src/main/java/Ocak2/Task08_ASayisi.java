package Ocak2;

import java.util.Scanner;

public class Task08_ASayisi {
    public static void main(String[] args) {

          /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın
        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir mesaj giriniz : ");
        String mesaj = input.nextLine().toUpperCase();
        int adet = 0;
        String cMesaj = mesaj.split("C")[0];
        for (int i = 0; i < cMesaj.length(); i++) {
            if (cMesaj.charAt(i) == 'A'){
                adet++;
            }
        }
        System.out.println("Girdiğiniz mesaj da 'C' harfinden önce " + adet + " adet A harfi bulunmaktadır...");
    }
}
