package Ocak2;

import java.util.Scanner;

public class Task13_PinKontrol {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen PIN kodunuzu giriniz : ");
        String gPin = input.next();
        String Pin = "S.12345";
        byte kontrol = 2;

        while (!Pin.equals(gPin) && kontrol !=0){
            System.out.println("Girmiş olduğunuz Pin yanlıştır. Lütfen Tekrar deneyiniz.." +
                    "\n Kalan deneme hakkınız : "+kontrol);
            kontrol -= 1;
            gPin = input.next();
        }
        if (Pin.equals(gPin)){
            System.out.println("Hoşgeldiniz");
        }else {
            System.out.println("Giriş hakkınız kalmamıştır.");
        }
    }
}
