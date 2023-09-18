package Latihan4;
import java.util.Scanner;

public class kelilinglingkaran {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double keliling, phi= 3.14;
        int d;

        System.out.println("Masukkan diameter");
        d = input.nextInt();

        keliling = phi * d;

        System.out.println("Keliling lingkaran =" + keliling);
    }
}
