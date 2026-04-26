package Latihan1;

import java.util.Scanner;

public class P2_AziepMusa {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nama; 
        int usia;

        System.out.print("======================\n");
        System.out.print("Input nama: ");
        nama = input.nextLine();
        System.out.print("Input usia: ");
        usia = input.nextInt();
        System.out.println("\n==== Hasil Input =====");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("======================");
 
        input.close();
    }
}
