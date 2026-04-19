package TugasP7;

import java.util.Scanner;

public class TugasP7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int realisasi, kehadiran;
        float tugas, uts, uas;

        // Header program
        System.out.println("===============================");
        System.out.println("   Sistem Penilaian Akademik   ");
        System.out.println("===============================");

        // 1. Tahap Pengumpulan Data
        System.out.print("Input nama                : ");
        nama = input.nextLine();

        System.out.print("Input realisasi pertemuan : ");
        realisasi = input.nextInt();

        System.out.print("Input kehadiran           : ");
        kehadiran = input.nextInt();

        System.out.print("Input nilai tugas         : ");
        tugas = input.nextFloat();

        System.out.print("Input nilai UTS           : ");
        uts = input.nextFloat();

        System.out.print("Input nilai UAS           : ");
        uas = input.nextFloat();

        // 2. Tahap Validasi Kehadiran
        float batasKehadiran = realisasi * 75 / 100;
        float persentaseKehadiran = (float) kehadiran / realisasi * 100;

        System.out.println("\n========= HASIL PENILAIAN =========");
        System.out.println("Nama                : " + nama);
        System.out.println("Kehadiran           : " + kehadiran);
        System.out.printf("Persentase Kehadiran: %.1f%%\n", persentaseKehadiran);

        // 3. Cek syarat kehadiran (minimal 75% dari realisasi)
        if (kehadiran >= batasKehadiran) {

            // 4. Tahap Kalkulasi Nilai
            float presensi   = (float) kehadiran / realisasi * 10;
            float nilaiTugas = tugas * 20 / 100;
            float nilaiUts   = uts   * 30 / 100;
            float nilaiUas   = uas   * 40 / 100;

            float total = presensi + nilaiTugas + nilaiUts + nilaiUas;

            System.out.printf("Total Nilai Akhir   : %.2f\n", total);

            // 5. Tahap Grading
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
            // Kehadiran tidak memenuhi syarat
            System.out.println("Peringatan          : Kehadiran kurang dari 75%!");
            System.out.println("Grade               : E");
            System.out.println("Status              : Tidak Lulus (Otomatis)");
        }

        System.out.println("=====================================");
        input.close();
    }
}