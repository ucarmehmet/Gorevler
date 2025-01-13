package Ocak10;

public class Task11_IkiArrayElemanToplam {
    public static void main(String[] args) {

        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int[][] arr1 = { {1,2}, {3,4,5}, {6} };
        int[][] arr2 = { {7,8,9}, {10,11}, {12} };

        int toplam = 0;
        for (int[] w : arr1){
            for (int k : w){
                toplam += k;
            }
        }
        for (int[] w : arr2){
            for (int k : w){
                toplam += k;
            }
        }

        System.out.println("Verilen iki dizideki tüm elamanların toplamı : " + toplam);

    }
}
