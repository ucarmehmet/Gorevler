package Ocak10;

import java.util.Arrays;

public class Task03_arrayIsaretDegis {
    public static void main(String[] args) {

        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int[] myArray = {1,2,-3,4,-5,-6};
        int i = 0;
        for (int w : myArray){
            w = -w;
            myArray[i] = w;
            i++;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
