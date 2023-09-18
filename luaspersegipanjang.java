package Latihan4;

import java.util.Scanner;
public class luaspersegipanjang {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.println("Masukkan panjang persegi");
        panjang= input.nextInt();
        System.out.println("Masukkan lebar persegi");
        lebar= input.nextInt();
        luas = panjang * lebar;

        System.out.println("Luas persegi panjang adalah" + luas);

    }
}
