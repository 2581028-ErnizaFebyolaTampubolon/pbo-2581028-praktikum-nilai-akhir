import java.util.Scanner;

public class NilaiAkhir {

    // Konstanta bobot nilai
    static final double BOBOT_PRAKTIKUM = 0.30;
    static final double BOBOT_TUGAS = 0.20;
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan nilai Praktikum : ");
        double praktikum = input.nextDouble();

        System.out.print("Masukkan nilai Tugas     : ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan nilai MID       : ");
        double mid = input.nextDouble();

        System.out.print("Masukkan nilai Final     : ");
        double nilaiFinal = input.nextDouble();

        // Menghitung nilai akhir dalam satu ekspresi
        double akhir = praktikum * BOBOT_PRAKTIKUM
                + tugas * BOBOT_TUGAS
                + mid * BOBOT_MID;
        // Augmented assignment
        akhir += nilaiFinal * BOBOT_FINAL;

        // Casting dengan cara memotong angka desimal
        int hasilCasting = (int) akhir;

        // Pembulatan menggunakan Math.round()
        long hasilPembulatan = Math.round(akhir);

        // Selisih hasil casting dan pembulatan
        long selisih = hasilPembulatan - hasilCasting;

        // Boolean untuk menentukan status kelulusan
        boolean lulus = akhir >= 60;

        System.out.println("Nilai Akhir :  "+akhir);

        input.close();
    }
}