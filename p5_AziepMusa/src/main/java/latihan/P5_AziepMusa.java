package latihan;

import java.util.Scanner;

public class P5_AziepMusa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simulasi Sistem E-Wallet Interaktif ===");

        // Input
        System.out.print("Apakah akun Anda aktif? (true/false): ");
        boolean akunAktif = input.nextBoolean();
        System.out.print("Masukkan saldo awal: Rp ");
        double saldo = input.nextDouble();
        System.out.print("Masukkan nominal transaksi: Rp ");
        double nominal = input.nextDouble();
        System.out.println("\nMemproses...\n");

        // 1. Cek akun (if)
        System.out.println("--- 1. Cek Status Akun ---");
        if (!akunAktif) {
            System.out.println("Sistem: Akun tidak aktif! Transaksi dibatalkan.");
            return;
        } else {
            System.out.println("Sistem: Akun aktif.");
        }

        // 2. Proses transaksi (if-else)
        System.out.println("\n--- 2. Proses Transaksi ---");
        boolean berhasil = false;

        if (saldo >= nominal) {
            saldo -= nominal;
            berhasil = true;
            System.out.println("Sistem: Transaksi berhasil.");
            System.out.println("Sisa saldo: Rp " + saldo);
        } else {
            System.out.println("Sistem: Transaksi gagal! Saldo tidak cukup.");
        }

        // 3. Poin bonus (if-else if)
        System.out.println("\n--- 3. Poin Bonus ---");

        if (berhasil) {
            int poin = 0;

            if (nominal >= 100000) {
                poin = 50;
                System.out.println("Tier 1: +50 poin");
            } else if (nominal >= 50000) {
                poin = 20;
                System.out.println("Tier 2: +20 poin");
            } else if (nominal >= 10000) {
                poin = 5;
                System.out.println("Tier 3: +5 poin");
            } else {
                System.out.println("Tidak mendapat poin.");
            }

            System.out.println("Total poin didapat: " + poin);
        } else {
            System.out.println("Tidak ada poin karena transaksi gagal.");
        }

        System.out.println("\n=== Selesai ===");

        input.close();
    }
}