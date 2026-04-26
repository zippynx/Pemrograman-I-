package tugas;

import java.util.Scanner;

public class CheckoutSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Kasir Sederhana ===");

        System.out.print("Masukkan total belanja: Rp ");
        double totalBelanja = input.nextDouble();

        if (totalBelanja < 0) {
            System.out.println("Input tidak valid!");
            input.close();
            return;
        }

        double diskon = 0;

        if (totalBelanja >= 100000) {
            diskon = totalBelanja * 0.10;
            System.out.println("Keterangan: Pelanggan mendapatkan diskon 10%");
        } else {
            System.out.println("Keterangan: Tidak ada diskon");
        }

        double totalBayar = totalBelanja - diskon;

        System.out.println("\n=========================");
        System.out.println("    STRUK PEMBAYARAN     ");
        System.out.println("=========================");
        System.out.printf("Total Belanja   : Rp %,.2f\n", totalBelanja);
        System.out.printf("Potongan Diskon : Rp %,.2f\n", diskon);
        System.out.println("-------------------------");
        System.out.printf("TOTAL BAYAR     : Rp %,.2f\n", totalBayar);
        System.out.println("=========================");

        input.close();
    }
}