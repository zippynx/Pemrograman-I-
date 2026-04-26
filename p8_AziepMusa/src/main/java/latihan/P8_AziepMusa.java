package latihan;

import java.util.Scanner;

public class P8_AziepMusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas perulangan: ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            System.out.println("Nilai ke-" + i);
        }

        input.close();
    }
}