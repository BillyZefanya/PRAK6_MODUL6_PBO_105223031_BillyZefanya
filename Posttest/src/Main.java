import rental.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kendaraan> daftar = new ArrayList<>();

        
        daftar.add(new Mobil("B1234AA", "Avanza", 2010, 200000, 7)); // lama >5
        daftar.add(new Mobil("B5678BB", "Brio", 2020, 180000, 4));   // baru <=5
        daftar.add(new Motor("B1111CC", "Ninja", 2018, 100000, 250)); // >=250
        daftar.add(new Motor("B2222DD", "Beat", 2021, 80000, 110));   // <250

        for (Kendaraan k : daftar) {
            k.displayInfo();
            System.out.println("Total Biaya Sewa 5 Hari: " + k.hitungHargaSewa(5));
        }
    }
}