package Ocak2;

import java.util.Scanner;

public class Task12_XileBitir {
    public static void main(String[] args) {

           /* TASK :
          Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
           ve x girildiğinde ise "Program bitti" yazan programı yazınız.
          */

        System.out.println("Program çalışıyor...");
        Scanner input = new Scanner(System.in);
        String deger = input.next().toLowerCase();
        while (deger.equals("x")){
            System.out.println("Program bitti...");
            break;
        }

    }
}
