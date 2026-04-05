import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float realisasi;
        float kehadiranKamu; 
        float tugasKamu;
        float uts;
        float uas;
        
        float presensi;
        float tugas;

        System.out.print("Input realisasi pertemuan: ");
        realisasi = input.nextFloat();

        System.out.print("Input kehadiran kamu: ");
        kehadiranKamu = input.nextFloat();

        System.out.print("Input nilai tugas kamu: ");
        tugasKamu = input.nextFloat();

        System.out.print("Input nilai UTS: ");
        uts = input.nextFloat();

        System.out.print("Input nilai UAS: ");
        uas = input.nextFloat();

        presensi = (kehadiranKamu / realisasi) * 10;
        tugas = (tugasKamu * 20) / 100;

        System.out.println("\n=== Hasil Akhir Penilaian ===");
        System.out.println("Realisasi Pertemuan : " + realisasi);
        System.out.println("Total Kehadiran     : " + kehadiranKamu);
        System.out.println("Skor Presensi       : " + presensi);
        System.out.println("Skor Tugas          : " + tugas);
        System.out.println("Nilai UTS           : " + uts);
        System.out.println("Nilai UAS           : " + uas);
        System.out.println("=============================");
 
        input.close();
    }
}