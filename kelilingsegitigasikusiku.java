package Latihan4;
import java.util.Scanner;

public class kelilingsegitigasikusiku {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    
        int sisiA;
        int sisiB;
        int sisiC;
        int keliling;

        System.out.println("Masukkan sisi A: ");
        sisiA = input.nextInt();
        System.out.println("Masukkan sisi B: ");
        sisiB = input.nextInt();
        System.out.println("Masukkan sisi C: ");
        sisiC = input.nextInt();

        keliling = sisiA+ sisiB + sisiC ;

        System.out.println("keliling segitiga siku-siku adalah: " + keliling);
}
}
