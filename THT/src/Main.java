import java.util.ArrayList;
import perusahaan.*;

public class Main {
    public static void main(String[] args) {
        double anggaran = 0, gajiTertinggi = 0, totalRating = 0;
        String namaGajiTertinggi = "";

        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>(); //Menggunakan Array List dalam menyimpan objek

        daftarKaryawan.add(new Karyawan("K001", "Andi", 2020, 2.0, 5000000));
        daftarKaryawan.add(new Developer("D001", "Budi", 2018, 4.0, 8000000, "Senior", 20));
        daftarKaryawan.add(new Developer("D002", "Citra", 2024, 2.8, 6000000, "Mid", 15));
        daftarKaryawan.add(new Manajer("M001", "Dono", 2015, 4.8, 10000000, "IT", 10));
        daftarKaryawan.add(new Manajer("M002", "Euis", 2025, 3.5, 9000000, "HR", 3));

        for (Karyawan k : daftarKaryawan){ //Perulangan untuk mengambil data dari setiap objek yang terimpan dalma Array List 
            double gaji = k.hitungGajiTotal();
            System.out.println("======= Informasi Karyawan ======="); 
            k.displayInfo(); //Mengerluarkan informasi dari setiap objek
            System.out.printf("Total Gaji Bulan Ini\t: Rp%,.2f\n", gaji); //Mengouput gaji dari suatu objek
            System.out.println("==================================");
            
            anggaran += gaji; //Menjumlahkan gaji dari setiap objek
            if(gaji > gajiTertinggi){ //Memeriksa jika objek yang diperiksa memiliki gaji yang lebih tinggi dari yang telah diperiksa
                gajiTertinggi = gaji; // Mengambil gaji yang lebih besar 
                namaGajiTertinggi = k.getNama(); //Mengambil nama dari yang mempunyai gaji tertinggi
            }
            totalRating += k.getRatingKinerja();// menjumlahkan rating dari setiap objek
        }

        System.out.printf("Total Anggaran Gaji  : Rp%,.2f\n", anggaran);
        System.out.printf("Highest Earner       : %s (Rp%,.2f)\n", namaGajiTertinggi, gajiTertinggi);
        System.out.printf("Rata-rata Rating     : %.2f\n", (totalRating/daftarKaryawan.size()));

    }
}
