import java.util.Scanner;

public class Tugas1Modify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("\n==============================");
            System.out.println("   KALKULATOR BMI (Body Mass Index)  ");
            System.out.println("==============================");

            // Input data
            System.out.print("Masukkan nama       : ");
            String nama = input.next();

            System.out.print("Masukkan berat (kg) : ");
            float berat = input.nextFloat();

            System.out.print("Masukkan tinggi (cm): ");
            float tinggi = input.nextFloat();

            float tinggiMeter = tinggi / 100;
            float bmi = berat / (tinggiMeter * tinggiMeter);

            String kategori;
            String saran;
            int kategoriKode;

            if (bmi < 18.5) {
                kategoriKode = 1;
            } else if (bmi < 25.0) {
                kategoriKode = 2;
            } else if (bmi < 30.0) {
                kategoriKode = 3;
            } else {
                kategoriKode = 4;
            }

            switch (kategoriKode) {
                case 1:
                    kategori = "Kurus (Underweight)";
                    saran   = "Tingkatkan asupan kalori & protein!";
                    break;
                case 2:
                    kategori = "Normal (Ideal)";
                    saran   = "Pertahankan pola hidup sehat!";
                    break;
                case 3:
                    kategori = "Gemuk (Overweight)";
                    saran   = "Kurangi makanan berlemak & olahraga rutin!";
                    break;
                default:
                    kategori = "Obesitas";
                    saran   = "Segera konsultasi dengan dokter!";
                    break;
            }

            System.out.println("\n====== HASIL BMI: " + nama + " ======");
            System.out.printf("Berat Badan  : %.1f kg%n", berat);
            System.out.printf("Tinggi Badan : %.1f cm%n", tinggi);
            System.out.printf("Nilai BMI    : %.2f%n", bmi);
            System.out.println("Kategori     : " + kategori);
            System.out.println("Saran        : " + saran);
            System.out.println("================================");

            // Tanya ulangi atau tidak (loop)
            System.out.print("\nHitung BMI lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\nTerima kasih sudah menggunakan Kalkulator BMI!");
        input.close();
    }
}