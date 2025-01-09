package Ocak2;

import java.util.Scanner;

public class Task07_5sayi {
    public static void main(String[] args) {

        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Merhaba, sizden 5 adet sayı girmenizi isteyeceğim.");
        int toplam = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Lütfen "+i+". sayıyı giriniz : ");
            int sayi = input.nextInt();
            if (sayi < 5 || sayi > 10) {
                toplam += sayi;
            }
        }
        System.out.println("Girdiğiniz 5 adet sayıdan 5 ile 10 arasındakiler haricinin toplamı = "+toplam+"'dır...");
    }
}
