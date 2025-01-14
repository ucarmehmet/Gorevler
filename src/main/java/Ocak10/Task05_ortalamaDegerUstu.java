package Ocak10;

public class Task05_ortalamaDegerUstu {
    public static void main(String[] args) {

        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int input[] = {1,2,3,4,5,6,7};
        int toplam =0;
        int ort = 0;
        String sonuc = "";

        for (int w : input){
            toplam = toplam + w;
        }
        ort = toplam / input.length;

        for (int w :input){
            if (w > ort){
                sonuc = sonuc + w +" ";
            }
        }
        System.out.println("Verilen dizi içerisinde dizi elamanlarının ortalamasından büyük olanlar \n"+sonuc);
    }
}
