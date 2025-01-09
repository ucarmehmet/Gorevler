package Ocak2;

import java.util.Scanner;

public class Task11_UsluSayi {
    public static void main(String[] args) {

         /*   Kullanicidan 2 sayi alaliniz.
         1. sayi taban
         2. sayi Ust
         1 sayinin ussunu hesaplatan code create ediniz.
          3, 3  sonuc = 27
         2  3 = 2*2*2=8
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hesaplatmak istediğiniz üslü sayının değerlerini 1.si taban 2.si üstü olacak şekilde giriniz. : ");

        int taban = input.nextInt();
        int ust = input.nextInt();
        int toplam = 1;

        while (taban != 0 && ust != 0){
            for (int i = 1; i <= ust; i++) {
                toplam = toplam*taban;
            }break;
        }
        if(taban == 0){
            System.out.println("Lütfen geçerli bir taban sayısı giriniz...");
        }else {
            System.out.println("Girilen üslü ifadenin karşılığı : " + toplam);
        }
    }
}
