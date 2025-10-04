import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, hasilpenjumlahan, hasilperkalian;

        x = Integer.parseInt(input.nextLine());
        y = Integer.parseInt(input.nextLine());
        if (x % 2 == 0) {
            System.out.println("bilangan pertama: genap ");
        } else {
            System.out.println("bilangan pertama: ganjil ");
        }
        if (y % 2 == 0) {
            System.out.println("bilangan pertama: genap ");
        } else {
            System.out.println("bilangan pertama: ganjil ");
        }
        if (x > y) {
            System.out.println(" bilangan pertama lebih besar ");
        } else {
            if (y > x) {
                System.out.println(" bilangan kedua lebih besar ");
            } else {
                System.out.println(" kedua bilangan sama besar ");
            }
        }
        if (x % 2 == 0 && y % 2 == 0) {
            hasilpenjumlahan = x + y;
            System.out.println("hasilpenjumlahan: " + hasilpenjumlahan);
        } else {
            if (x % 2 != 0 && y % 2 != 0) {
                hasilperkalian = x * y;
                System.out.println("hasil perkalian: " + hasilperkalian);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
