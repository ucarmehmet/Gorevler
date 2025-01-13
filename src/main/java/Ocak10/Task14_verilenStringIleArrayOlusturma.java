package Ocak10;

import java.util.Arrays;

public class Task14_verilenStringIleArrayOlusturma {
    public static void main(String[] args) {

        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */
        String str = "Congratulations";

        String[] arrStr = str.split("");
        String[] tersArr = new String[arrStr.length];
        System.out.println("Verilen " + str + " ifadesinin Arraye aktarılmış hali : " + Arrays.toString(arrStr));
        int k = 0;
              for (int i = arrStr.length - 1; i > -1; i--) {
                if (arrStr[i].equals("o") || arrStr[i].equals("a") || arrStr[i].equals("u")) {
                    tersArr[k] = "i";
                    k++;
                } else {
                    tersArr[k] = arrStr[i];
                    k++;
                }
            }
        System.out.println("Ters çevrilmiş ve o, a ve u harfleri i harfi ile değiştirilmiş çıktısı : "+ Arrays.toString(tersArr));
    }
}
