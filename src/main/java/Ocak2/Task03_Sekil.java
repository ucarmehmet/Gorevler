package Ocak2;

public class Task03_Sekil {
    public static void main(String[] args) {

        /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;
                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

        byte satir = 5;

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= satir-i ; j++) {
                System.out.print(" ");
            }
            for (int j = satir; j > satir-i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
