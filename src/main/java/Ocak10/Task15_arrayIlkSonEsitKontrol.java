package Ocak10;

import java.util.Arrays;

public class Task15_arrayIlkSonEsitKontrol {
    public static void main(String[] args) {

        /*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */

        int[] arr = {2,6,4,8,2,6,2};

        if (arr[0] == arr[arr.length-1]){
            System.out.println("Verilen dizinin ilk elemanı olan " + arr[0] + " ile dizinin son elemanı olan " +
                    arr[arr.length - 1] + " sayıları eşittir. ");
        }else {
            System.out.println("Verilen dizinin ilk elemanı olan " + arr[0] + " ile dizinin son elemanı olan " +
                    arr[arr.length - 1] + " sayıları eşit değildir. ");
        }

    }
}
