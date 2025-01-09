package Ocak2;

import java.util.Scanner;

public class Task02_EbobEkok {
    public static void main(String[] args) {

        /*
         *  Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
         * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
         * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Ebob ve Ekok unu bulmak istediğiniz iki sayıyı giriniz : ");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int ebob=0;

        if (sayi1 > sayi2) {
            for (int i = 1; i <= sayi2 ; i++) {
                if (sayi1%i == 0 && sayi2%i == 0){
                    ebob = i;
                }
            }
            }else{
                for (int i = 1; i <=sayi1 ; i++) {
                    if (sayi1%i ==0 && sayi2%i == 0){
                        ebob = i;
                    }
                }
            }
        System.out.println("EBOB("+sayi1+","+sayi2+")="+ebob);
        System.out.println("EKOK("+sayi1+","+sayi2+")="+sayi1*sayi2/ebob);

    }
}
