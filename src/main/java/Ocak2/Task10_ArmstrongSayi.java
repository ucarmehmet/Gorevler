package Ocak2;

import java.util.Scanner;

public class Task10_ArmstrongSayi {
    public static void main(String[] args) {

         /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Armstrong sayı olup olmadığını kontrol etmek istediğiniz sayıyı giriniz : ");
        int sayi = input.nextInt();

        int sBasamak = String.valueOf(sayi).length();
        int basamakD = sayi;
        int kalan = sayi;
        int basamakT = 1;
        int toplam = 0;

        do {
            basamakD = kalan % 10;
            kalan = kalan / 10;
            for (int i = 1; i <= sBasamak; i++) {
                basamakT *=basamakD;
            }
            toplam += basamakT;
            basamakT = 1;
        }while (kalan != 0);
        if (toplam == sayi){
            System.out.println("Girdiğiniz sayı Armstrong sayıdır...");
        }else {
            System.out.println("Girdiğiniz sayı Armstrong sayı değildir...");
        }
    }
}
