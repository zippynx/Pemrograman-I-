package tugas;

import java.util.Scanner;
import java.util.Random;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int angkaRahasia = random.nextInt(10) + 1;
        int tebakan = 0;
        int percobaan = 0;

        System.out.println("===================================");
        System.out.println("      GAME TEBAK ANGKA             ");
        System.out.println("===================================");
        System.out.println("Saya sudah memilih sebuah angka antara 1 sampai 10.");
        System.out.println("Silakan coba tebak angka tersebut!\n");

        while (tebakan != angkaRahasia) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();
            percobaan++;

            if (tebakan < angkaRahasia) {
                System.out.println("❌ Tebakan terlalu kecil, coba angka yang lebih besar.");
            } else if (tebakan > angkaRahasia) {
                System.out.println("❌ Tebakan terlalu besar, coba angka yang lebih kecil.");
            } else {
                System.out.println("\n🎉 Selamat! Tebakan Anda benar.");
                System.out.println("Angka yang benar adalah: " + angkaRahasia);
                System.out.println("Total percobaan: " + percobaan + " kali.");
            }
        }

        input.close();
    }
}