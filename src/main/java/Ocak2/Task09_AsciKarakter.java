package Ocak2;

public class Task09_AsciKarakter {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
        for (int i = 0; i < 256 ; i++) {
            char ch = (char)i;
            System.out.println(i + "\t" + ch);
        }

    }
}
