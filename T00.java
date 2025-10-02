import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b;

        a = Double.parseDouble(input.nextLine());
        b = Double.parseDouble(input.nextLine());
        if (a % 2 == 0) {
            System.out.println(" bilangan pertama : genap ");
        } else {
            System.out.println(" bilangan pertama : ganjil ");
        }
        if (b % 2 == 0) {
            System.out.println(" bilangan kedua : genap ");
        } else {
            System.out.println(" bilangan kedua : ganjil ");
        }
        if (a > b) {
            System.out.println(" bilangan pertama lebih besar ");
        }
        if (b > a) {
            System.out.println(" bilangan kedua lebih besar ");
            System.out.println("Berbeda jenis");
        }
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println(" Hasil penjumlahan : " + a + b);
        }
        if (a % 2 == 1 && b % 2 == 1) {
            System.out.println(" kedua bilangan sama besar");
            System.out.println("Hasil perkalian: " + a * b);
        }
    }
}
