package Latihan4;
import java.util.Scanner;

public class kelilingpersegipanjang {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        System.out.println("Masukkan panjang persegi");
        panjang= input.nextInt();
        System.out.println("Masukkan lebar persegi");
        lebar= input.nextInt();

        keliling = 2 * (panjang + lebar);

        System.out.println("Keliling persegi panjang adalah" + keliling);
    }
}
