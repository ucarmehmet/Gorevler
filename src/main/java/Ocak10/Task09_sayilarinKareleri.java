package Ocak10;

import java.util.Arrays;

public class Task09_sayilarinKareleri {
    public static void main(String[] args) {

        /* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int[] arr = {2,6,4,5,8,9};
        System.out.println("Verilen dizi : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        System.out.println("Dizi elemanlarının karelerinin bulunmuş hali : " + Arrays.toString(arr));
    }
}
