package Ocak2;

import java.util.Scanner;

public class Task17_ziplayanTop {
    public static void main(String[] args) {

        /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen topun bırakıldığı yüksekliği cm cinsinden giriniz : ");
        double birakYukseklik = input.nextInt();
        double alYol = birakYukseklik;

        do {
            birakYukseklik = (birakYukseklik * 0.75);
            if (birakYukseklik > 100) {
                alYol = alYol + (2 * birakYukseklik);
            }
        }while(birakYukseklik > 99);
        System.out.println("Topun aldığı toplam yol "+alYol+" cm'dir.."+ birakYukseklik);

    }
}
