import java.util.ArrayList;
import perusahaan.*;

public class Main {
    public static void main(String[] args) {
        double anggaran = 0, gajiTertinggi = 0, totalRating = 0;
        String namaGajiTertinggi = "";

        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        daftarKaryawan.add(new Karyawan("K001", "Andi", 2020, 2.0, 5000000));
        daftarKaryawan.add(new Developer("D001", "Budi", 2018, 4.0, 8000000, "Senior", 20));
        daftarKaryawan.add(new Developer("D002", "Citra", 2024, 2.8, 6000000, "Mid", 15));
        daftarKaryawan.add(new Manajer("M001", "Dono", 2015, 4.8, 10000000, "IT", 10));
        daftarKaryawan.add(new Manajer("M002", "Euis", 2025, 3.5, 9000000, "HR", 3));

        for (Karyawan k : daftarKaryawan){
            double gaji = k.hitungGajiTotal();
            System.out.println("======= Informasi Karyawan =======");
            k.displayInfo();
            System.out.printf("Total Gaji Bulan Ini\t: Rp%,.2f\n", gaji);
            System.out.println("==================================");
            
            anggaran += gaji;
            if(gaji > gajiTertinggi){
                gajiTertinggi = gaji;
                namaGajiTertinggi = k.getNama();
            }
            totalRating += k.getRatingKinerja();
        }

        System.out.printf("Total Anggaran Gaji  : Rp%,.2f\n", anggaran);
        System.out.printf("Highest Earner       : %s (Rp%,.2f)\n", namaGajiTertinggi, gajiTertinggi);
        System.out.printf("Rata-rata Rating     : %.2f\n", (totalRating/daftarKaryawan.size()));

    }
}
