package TugasP7;

import java.util.Scanner;

public class TugasP7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Header program
        System.out.println("===============================");
        System.out.println("   Sistem Penilaian Akademik   ");
        System.out.println("===============================");

        // 1. Tahap Pengumpulan Data
        System.out.print("Input realisasi pertemuan : ");
        float realisasi = input.nextFloat();

        System.out.print("Input kehadiran           : ");
        float kehadiran = input.nextFloat();

        System.out.print("Input nilai tugas         : ");
        float tugas = input.nextFloat();

        System.out.print("Input nilai UTS           : ");
        float uts = input.nextFloat();

        System.out.print("Input nilai UAS           : ");
        float uas = input.nextFloat();

        // 2. Tahap Validasi Kehadiran
        float persentaseKehadiran = (kehadiran / realisasi) * 100;

        System.out.println("\n========= HASIL PENILAIAN =========");
        System.out.printf("Persentase Kehadiran: %.1f%%\n", persentaseKehadiran);

        if (persentaseKehadiran >= 75.0) {
            // 3. Tahap Kalkulasi Nilai (Jika syarat kehadiran terpenuhi)
            float presensi = (kehadiran / realisasi) * 10;
            float nilaiTugas = (tugas * 20) / 100;
            float nilaiUts = (uts * 30) / 100;
            float nilaiUas = (uas * 40) / 100;
            
            float total = presensi + nilaiTugas + nilaiUts + nilaiUas;

            System.out.printf("Total Nilai Akhir   : %.2f\n", total);

            // 4. Tahap Grading
            if (total >= 80) {
                System.out.println("Grade               : A");
                System.out.println("Status              : Lulus");
            } else if (total >= 70) {
                System.out.println("Grade               : B");
                System.out.println("Status              : Lulus");
            } else if (total >= 60) {
                System.out.println("Grade               : C");
                System.out.println("Status              : Lulus");
            } else if (total >= 50) {
                System.out.println("Grade               : D");
                System.out.println("Status              : Mengulang");
            } else {
                System.out.println("Grade               : E");
                System.out.println("Status              : Tidak Lulus");
            }

        } else {
            // Jika syarat kehadiran tidak terpenuhi
            System.out.println("Peringatan          : Kehadiran kurang dari 75%!");
            System.out.println("Status              : Tidak Lulus (Otomatis)");
        }

        System.out.println("=====================================");
        input.close();
    }
}