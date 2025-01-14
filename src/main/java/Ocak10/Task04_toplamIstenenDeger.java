package Ocak10;

public class Task04_toplamIstenenDeger {
    public static void main(String[] args) {

        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;

        String sonuc = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 9) {
                    sonuc = sonuc + "(" + arr[i] + "," + arr[j] + ") ";
                }
            }
        }
        System.out.println("Verilen dizi içerisinde değerleri toplamı 9 olan çiftler aşağıdaki gibidir.\n"+sonuc);

    }
}
