package asat_p2;

import java.util.Scanner;

public class Penilaian_Kelulusan {

    // Modifier private untuk variabel konstanta batas kelulusan
    private static double MINIMAL_NILAI_KELULUSAN = 70.0;
    private static final double MINIMAL_NILAI = 01.0;

    public static void main(String[] args) {
        // untuk input data
        Scanner scr = new Scanner(System.in);

        // Memanggil prosedur untuk memasukkan data
        String nama = MasukanNama(scr);
        double nilai = NilaiMahasiswa(scr);

        // Menghitung keterangan kelulusan
        String keterangan = tentukanKeterangan(nilai);

        // Menampilkan hasil akhir
        tampilkanHasil(nama, nilai, keterangan);

        // Menutup scanner
        scr.close();
    }

    // Fungsi inputNama: mengembalikan nama yang diinput
    public static String MasukanNama(Scanner scanner) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        return scanner.nextLine();
    }

    // Fungsi inputNilai: mengembalikan nilai yang diinput
    public static double NilaiMahasiswa(Scanner scanner) {
        System.out.print("Masukkan Nilai Mahasiswa: ");
        return scanner.nextDouble();
    }

    // Fungsi tentukanKeterangan: mengembalikan keterangan kelulusan berdasarkan nilai
    public static String tentukanKeterangan(double nilai) {
        if (nilai >= MINIMAL_NILAI_KELULUSAN) {
            return "Lulus";
        } else if (nilai < MINIMAL_NILAI) {
            return "niai tidak valid";
        } else {
            return "Tidak Lulus";
        }
    }

    //MenampilkanHasil:nama, nilai, dan keterangan kelulusan
    public static void tampilkanHasil(String nama, double nilai, String keterangan) {
        System.out.println("\nHasil Penilaian:");
        System.out.println("Nama_Mahasiswa: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Keterangan: " + keterangan);
    }
}
