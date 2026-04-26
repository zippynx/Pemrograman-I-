package tugas;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        double totalNilai = 0;
        int jumlahMahasiswa = 0;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();
            
            totalNilai += nilai;
            jumlahMahasiswa++; 

            System.out.print("Input nilai lagi? (y/t): ");
            ulang = input.next().charAt(0);
            
        } while (ulang != 't' && ulang != 'T');

        // Mencegah pembagian dengan nol
        if (jumlahMahasiswa > 0) {
            double rataRata = totalNilai / jumlahMahasiswa;
            System.out.println("Rata-rata nilai: " + rataRata);
        } else {
            System.out.println("Belum ada data nilai yang diinput.");
        }
        input.close();
    }
}