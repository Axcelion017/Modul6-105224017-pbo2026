package rental;

public class Kendaraan {
    String nomorPolisi, merk;
    int tahunProduksi;
    double hargaSewaDasar;

    Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar){
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void displayInfo(){
        System.out.println("Nomor Polisi: " + nomorPolisi);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga Sewa Dasar: Rp" + hargaSewaDasar);
    }

    public double hitungHargaSewa(int hari){
        double totalHarga = hargaSewaDasar * hari;
        if (this.tahunProduksi < 2015) {
            return totalHarga * 0.9; 
        }
        return totalHarga;
    }
}
