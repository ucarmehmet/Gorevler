package Ocak2;

import java.util.Scanner;

public class Task15_UrunSatis {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

        boolean mKartVar = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adedini giriniz : ");
        byte uAdet = input.nextByte();
        System.out.println("Lütfen aldığınız ürünün liste fiyatını giriniz : ");
        double uFiyat = input.nextDouble();
        double tTutar = uAdet * uFiyat;
        System.out.println("Müşteri kartınız var mı? (E/H)");
        if (input.next().toUpperCase().equals("E")){
            mKartVar = true;
        }else {
            mKartVar = false;
        }

        while (mKartVar){
            if (uAdet > 9){
                System.out.println("Ürün Adedi \t Liste Fiyatı \t Tutarı \t İndirim(%20) \t İndirimli Tutarı");
                System.out.println(" \t "+uAdet+" \t\t"+uFiyat+" \t\t\t"+tTutar+" \t\t\t"+(tTutar*0.20) +" \t\t\t"+ (tTutar-(tTutar*0.20)));
                break;
            }else {
                System.out.println("Ürün Adedi \t Liste Fiyatı \t Tutarı \t İndirim(%15) \t İndirimli Tutarı");
                System.out.println(" \t "+uAdet+" \t\t\t"+uFiyat+" \t\t\t"+tTutar+" \t\t\t"+(tTutar*0.15) +" \t\t\t"+ (tTutar-(tTutar*0.15)));
                break;
            }
        }

        while(!mKartVar){
            if (uAdet > 9){
                System.out.println("Ürün Adedi \t Liste Fiyatı \t Tutarı \t İndirim(%15) \t İndirimli Tutarı");
                System.out.println(" \t "+uAdet+" \t\t"+uFiyat+" \t\t\t"+tTutar+" \t\t\t"+(tTutar*0.15) +" \t\t\t"+ (tTutar-(tTutar*0.15)));
                break;
            }else {
                System.out.println("Ürün Adedi \t Liste Fiyatı \t Tutarı \t İndirim(%10) \t İndirimli Tutarı");
                System.out.println(" \t "+uAdet+" \t\t\t"+uFiyat+" \t\t\t"+tTutar+" \t\t\t"+(tTutar*0.10) +" \t\t\t"+ (tTutar-(tTutar*0.10)));
                break;
            }
        }

    }
}
