package Ocak10;

import java.util.Arrays;

public class Task16_DizidekiRakamlarToplami {
    public static void main(String[] args) {

        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String vdeger = "ade1r4d3";
        Character[] arr = new Character[vdeger.length()];

        for (int i = 0; i < vdeger.length(); i++) {
            arr[i] = vdeger.charAt(i);
        }
        System.out.println("Verilen Karekter Dizisi : " + Arrays.toString(arr));
        int toplam = 0;
        for (Character w : arr){
            if (Character.isDigit(w)){
                toplam += Integer.valueOf(w.toString());
            }
        }
        System.out.println("Verilen dizideki rakamların toplamı : " + toplam);
    }
}
