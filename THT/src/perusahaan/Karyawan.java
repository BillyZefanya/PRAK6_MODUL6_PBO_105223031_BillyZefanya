package perusahaan;

// Superclass Karyawan
public class Karyawan {
    // atribut private (encapsulation)
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    // Konstruktor
    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;

        // validasi rating (1.0 - 5.0)
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0; // default
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getRatingKinerja() {
        return ratingKinerja;
    }

    // Method hitung gaji
    public double hitungGajiTotal() {
        int tahunSekarang = 2026;

        // hitung masa kerja
        int masaKerja = tahunSekarang - tahunMasuk;

        // bonus loyalitas = 5% per tahun
        double bonus = gajiPokok * 0.05 * masaKerja;

        double total = gajiPokok + bonus;

        // penalti jika rating < 2.5
        if (ratingKinerja < 2.5) {
            total = total * 0.9; // potong 10%
        }

        return total;
    }

    // tampilkan info
    public void displayInfo() {
        System.out.println("ID: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Rating: " + ratingKinerja);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
    }
}