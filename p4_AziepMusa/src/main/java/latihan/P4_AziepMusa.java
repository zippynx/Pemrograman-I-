package latihan;

import java.util.Scanner;

public class P4_AziepMusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Menghitung Nilai Mahasiswa ===");
        
        // input presensi
        System.out.print("Masukkan Jumlah Kehadiran: ");
        float kehadiran = input.nextFloat();
        System.out.print("Masukkan Total Realisasi Pertemuan: ");
        float realisasi = input.nextFloat();
        
        // input nilai tugas, UTS, UAS
        System.out.print("Masukkan Nilai Tugas: ");
        float nilaiTugas = input.nextFloat();
        System.out.print("Masukkan Nilai UTS: ");
        float nilaiUTS = input.nextFloat();
        System.out.print("Masukkan Nilai UAS: ");
        float nilaiUAS = input.nextFloat();
        
        // hitung nilai
        float totalPresensi = (kehadiran/realisasi) * 10 / 100;
        float totalTugas = nilaiTugas * 20 / 100;
        float totalUTS = nilaiUTS * 30 / 100;
        float totalUAS = nilaiUAS * 40 / 100;
        float hasil = totalPresensi + totalTugas + totalUTS + totalUAS;
        
        // Output
        System.out.println("\n=== Rincian Nilai ===\n");
        System.out.println("Total Presensi: " + totalPresensi);
        System.out.println("Total Tugas: " + totalTugas);
        System.out.println("Total UTS: " + totalUTS);
        System.out.println("Total UAS: " + totalUAS);
        System.out.println("Hasil: " + hasil);
        
        input.close();
    }
}
