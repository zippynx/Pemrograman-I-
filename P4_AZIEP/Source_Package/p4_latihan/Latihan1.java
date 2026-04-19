package p4_latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float realisasi;
        float presensi;
        float kehadiran;
        float tugas;
        float uts;
        float uas;
        float total;

        System.out.print("Input realisasi pertemuan: ");
        realisasi = input.nextFloat();

        System.out.print("Input kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.print("Input nilai tugas: ");
        tugas = input.nextFloat();

        System.out.print("Input nilai UTS: ");
        uts = input.nextFloat();

        System.out.print("Input nilai UAS: ");
        uas = input.nextFloat();
        
        //P1
        presensi = (kehadiran / realisasi) * 10;
        tugas = (tugas * 20) / 100;
        uts = (uts * 30) / 100;
        uas = (uas * 40) / 100;
        total = presensi + tugas + uts + uas;
        
        //S2
        System.out.println("\n==== Hasil Akhir Penilaian ====");
        System.out.println("   " + presensi + " |  " + tugas + " | " + uts + " | " + uas);
        System.out.println("        total      ");
        System.out.println(total);
        System.out.println("===============================");

        input.close();
    }
}