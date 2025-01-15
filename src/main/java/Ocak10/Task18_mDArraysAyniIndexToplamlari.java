package Ocak10;

import java.util.Arrays;

public class Task18_mDArraysAyniIndexToplamlari {
    public static void main(String[] args) {

        /*Aşağıdaki mutli dimensional array'lerin iç array'lerinde
         aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
         arr1[]={{1,2},{3,4,5}{6}}
         arr2[]={{7,8,9},{10,11},{12}} */

        int[][] arr1 = {{1,2},{3,4,5},{6}};
        int[][] arr2 = {{7,8,9},{10,11},{12}};
        System.out.println("arr1 = "+Arrays.deepToString(arr1));
        System.out.println("arr2 = "+Arrays.deepToString(arr2));

        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            for (int j = 0; j < arr1[i].length && j < arr2[i].length; j++) {

                System.out.println("arr1 in ["+i+"]["+j+"] indeksi ile arr2 nin ["+i+"]["+j+"] indeksindeki sayıların toplamı = " + (arr1[i][j] + arr2[i][j]));

            }
        }
    }
}
