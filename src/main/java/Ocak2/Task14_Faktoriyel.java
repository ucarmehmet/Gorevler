package Ocak2;

import java.util.Scanner;

public class Task14_Faktoriyel {
    public static void main(String[] args) {

        /* TASK :
          Verilen bir sayının faktöriyelini özyineli (recursive) olarak
          hespalayan fonksiyonu yazınız.
          Örnek Ekran Çıktıları
          Bir sayi giriniz: 6*5*4*3*2*1=720
          Faktöriyeli: 720
          Bir sayı giriniz: 3*2*1
          Faktöriyeli 6
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen foktöriyelini hesaplatmak istediğiniz sayıyı giriniz : ");
        int sayi = input.nextInt();
        int faktoriyel = 1;
        String sFaktoriyel = "";

        do {
            faktoriyel = faktoriyel * sayi;
            if (sayi>1) {
                sFaktoriyel = sFaktoriyel + sayi + "*";
            }else{
                sFaktoriyel = sFaktoriyel + sayi;
            }
            sayi--;
        }while(sayi > 0);

        System.out.println(sFaktoriyel + " = " + faktoriyel);
        System.out.println("Faktöriyeli : " + faktoriyel);

    }
}
