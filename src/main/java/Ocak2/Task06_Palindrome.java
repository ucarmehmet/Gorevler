package Ocak2;

import java.util.Scanner;

public class Task06_Palindrome {
    public static void main(String[] args) {

        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime = input.next();
        String terstenkelime = "";

        for (int i = kelime.length()-1; i >= 0 ; i--) {
            terstenkelime += kelime.charAt(i);
        }
        if (kelime.equals(terstenkelime)){
            System.out.println("Girilen kelime Palindrome bir kelimedir...");
        }else
            System.out.println("Girilen kelime Palindrome bir kelime değildir...");

    }
}
