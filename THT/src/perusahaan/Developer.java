package perusahaan;

public class Developer extends Karyawan {
    private String level;
    private int jumlahBugFix;

    // Konstruktor
    public Developer(String id, String nama, int tahunMasuk, double gajiPokok,
                     double rating, String level, int jumlahBugFix) {
        super(id, nama, tahunMasuk, gajiPokok, rating);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    // Override hitung gaji
    @Override
    public double hitungGajiTotal() {
        double total = super.hitungGajiTotal();

        // tunjangan level
        if (level.equalsIgnoreCase("Mid")) {
            total += 1500000;
        } else if (level.equalsIgnoreCase("Senior")) {
            total += 3000000;
        }

        // bonus bug jika rating >= 3.0
        if (getRatingKinerja() >= 3.0) {
            total += jumlahBugFix * 50000;
        }

        return total;
    }

    // override display
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: " + level);
        System.out.println("Bug Fix: " + jumlahBugFix);
    }
}