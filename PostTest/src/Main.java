import rental.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Kendaraan> kendaraanList = new ArrayList<>();
        kendaraanList.add(new Mobil("B 1234 CD", "Toyota Avanza", 2014, 300000, 7));
        kendaraanList.add(new Mobil("B 4321 AB", "Daihatsu Xenia", 2021, 250000, 3));
        kendaraanList.add(new Motor("B 5678 EF", "Honda CBR250RR", 2016, 200000, 250));
        kendaraanList.add(new Motor("B 8765 GH", "Yamaha Nmax", 2013, 120000, 155));

        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println("======================================");
            kendaraan.displayInfo();
            System.out.println("Total Biaya Sewa selama 5 Hari: Rp" + kendaraan.hitungHargaSewa(5));
            System.out.println("======================================");
        }
    }
}
