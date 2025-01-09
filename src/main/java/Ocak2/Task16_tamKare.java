package Ocak2;

import java.util.Scanner;

public class Task16_tamKare {
    public static void main(String[] args) {

         /*   TASK :
             Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
             tamkare ise true  değilse false yazdırınız.
              Not: sqrt gibi fonksiyonları  kullanmayın.
              Example 1:
              Input: 16
              Output: true
              Not: bu sayı tamkare çünkü 4*4 = 16
              Example 2:
              Input: 25
              Output: true
              Note: bu sayı tamkare çünkü 5*5=25
              Example 3:
              Input: 14
              Output: false
           */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tam kare olup olmadığını öğrenmek istediğiniz sayıyı giriniz : ");
        int sayi = input.nextInt();

        int sonuc = 0;
        int i = 0;
        do {
            i++;
            sonuc = i*i;
            if (sayi == sonuc){
                System.out.println("Girilen "+sayi+" sayısı "+ i+"*"+i+"="+i*i+" koşulunu sağladığı için tam kare bir sayıdır..." );
                break;
            }
        }while (sayi != sonuc && sonuc < sayi);
        if (sayi != sonuc && sonuc > sayi){
            System.out.println("Girilen " + sayi + " sayısı tam kare bir sayı değildir...");
        }

    }
}
