import java.util.Scanner;
import java.util.Locale;

public class Latihan2 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        String nama, nim, jurusan; 
        int usia;
        double ipk;

        System.out.println("--- Form Pendataan Mahasiswa ---");
        
        System.out.print("Input nama: ");
        nama = input.nextLine();

        System.out.print("Input NIM: ");
        nim = input.nextLine();

        System.out.print("Input program studi: ");
        jurusan = input.nextLine();

        System.out.print("Input usia: ");
        usia = input.nextInt();

        System.out.print("Input IPK (gunakan titik, misal 3.85): ");
        ipk = input.nextDouble();

        input.nextLine(); 

        System.out.println("\n=== Hasil Input ===");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Usia    : " + usia + " tahun");
        System.out.println("IPK     : " + ipk);
        
        System.out.print("Kategori Usia: ");
        if (usia >= 18) {
            System.out.println("Mahasiswa Dewasa");
        } else {
            System.out.println("Mahasiswa Remaja");
        }
        
        System.out.print("Status IPK: ");
        if (ipk >= 3.5) {
            System.out.println("Cum Laude - Pertahankan!");
        } else {
            System.out.println("Bagus - Tingkatkan terus!");
        }
        System.out.println("================================");
 
        input.close();
    }
}