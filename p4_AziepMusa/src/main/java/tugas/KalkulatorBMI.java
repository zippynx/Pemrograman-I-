package tugas;

import java.util.Scanner;

public class KalkulatorBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("        KALKULATOR BMI        ");
        System.out.println("==============================");

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

        if (bmi < 18.5) {
            kategori = "Kurus (Underweight)";
            saran    = "Tingkatkan asupan kalori & protein!";
        } else if (bmi < 25.0) {
            kategori = "Normal (Ideal)";
            saran    = "Pertahankan pola hidup sehat!";
        } else if (bmi < 30.0) {
            kategori = "Gemuk (Overweight)";
            saran    = "Kurangi makanan berlemak & olahraga rutin!";
        } else {
            kategori = "Obesitas";
            saran    = "Segera konsultasi dengan dokter!";
        }

        System.out.println("\n====== HASIL BMI: " + nama + " ======");
        System.out.println("Berat Badan  : " + berat + " kg");
        System.out.println("Tinggi Badan : " + tinggi + " cm");
        System.out.println("Nilai BMI    : " + bmi);
        System.out.println("Kategori     : " + kategori);
        System.out.println("Saran        : " + saran);
        System.out.println("================================");

        input.close();
    }
}