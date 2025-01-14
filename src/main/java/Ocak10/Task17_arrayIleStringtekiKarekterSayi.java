package Ocak10;

import java.util.Arrays;

public class Task17_arrayIleStringtekiKarekterSayi {
    public static void main(String[] args) {

         /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        String input = "Javacilar cook afilli";
        String ydizielemansayisi = "";
        for (int i = 0; i < input.length(); i++) {
            if (!ydizielemansayisi.contains(input.charAt(i)+"")){
                ydizielemansayisi += input.charAt(i);
            }
        }

        String[] yeniArr = new String[ydizielemansayisi.length()];
int toplam = 0;
        for (int i = 0; i < ydizielemansayisi.length(); i++) {

            for (int j = 0; j < input.length(); j++) {
                if (ydizielemansayisi.charAt(i) == input.charAt(j)){
                    toplam++;
                }
            }

            yeniArr[i] = ydizielemansayisi.charAt(i) + " = " + toplam;
            toplam = 0;}


        System.out.println(ydizielemansayisi);
        System.out.println(Arrays.toString(yeniArr));

        System.out.println(ydizielemansayisi.length());

    }
}
