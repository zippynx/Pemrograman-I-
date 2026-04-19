package p7_latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        int kehadiran, nilai;
        int v;
        Scanner input = new Scanner(System.in);

        System.out.print("Input Jumlah Kehadiran: ");
        kehadiran = input.nextInt();

        System.out.print("Input Nilai: ");
        nilai = input.nextInt();

        v = 21 * 75 / 100; 

        if (kehadiran >= v) {
            System.out.println("\nMaka cetak nilai & grade:");
            System.out.println("Nilai: " + nilai);

            if (nilai >= 80) {
                System.out.println("Grade: A");
            } else if (nilai >= 70) {
                System.out.println("Grade: B");
            } else if (nilai >= 60) {
                System.out.println("Grade: C");
            } else if (nilai >= 50) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }

        } else {
            System.out.println("\nKehadiran kurang dari 75%");
            System.out.println("Tidak Lulus");
        }

        input.close();
    }
}