package Ocak10;

import java.util.Arrays;

public class Task08_$£Toplamlar {
    public static void main(String[] args) {

        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] arr = str.split(" ");

        int toplam$ = 0;
        int toplam£ = 0;
        for (String w : arr){
            if (w.charAt(0) == '$'){
                toplam$ += Integer.valueOf(w.substring(1));
            }
            else {
                toplam£ += Integer.valueOf(w.substring(1));
            }
        }
        System.out.println("$ Toplamı : " + toplam$);
        System.out.println("£ Toplamı : " + toplam£);

    }
}
