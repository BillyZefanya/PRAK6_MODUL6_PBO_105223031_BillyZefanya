import perusahaan.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList Karyawan
        ArrayList<Karyawan> list = new ArrayList<>();

        // sesuai soal
        list.add(new Karyawan("B31", "Billy", 2020, 5000000, 2.0));
        list.add(new Developer("A01", "Akbar", 2018, 7000000, 4.0, "Senior", 20));
        list.add(new Developer("G02", "Gerald", 2024, 6000000, 2.8, "Mid", 15));
        list.add(new Manajer("I04", "Irfan", 2015, 10000000, 4.8, "IT", 10));
        list.add(new Manajer("C22", "Calvin", 2025, 8000000, 3.5, "HR", 3));

        double totalGaji = 0;
        double totalRating = 0;

        Karyawan tertinggi = null;
        double gajiTertinggi = 0;

        // looping
        for (Karyawan k : list) {
            k.displayInfo();

            double gaji = k.hitungGajiTotal();
            System.out.println("Total Gaji: Rp" + gaji);
            System.out.println(" ");

            totalGaji += gaji;
            totalRating += k.getRatingKinerja();

            // cari gaji tertinggi
            if (gaji > gajiTertinggi) {
                gajiTertinggi = gaji;
                tertinggi = k;
            }
        }

        // output tambahan
        System.out.println("Total Anggaran Gaji: Rp" + totalGaji);
        System.out.println("Karyawan Gaji Tertinggi: " + tertinggi.getNama());
        System.out.println("Rata-rata Rating: " + (totalRating / list.size()));
    }
}