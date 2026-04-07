package rental;

public class Mobil extends Kendaraan{
    int kapasitasPenumpang;

    public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang){
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    
    @Override
    public double hitungHargaSewa(int hari) {
        double totalHarga = super.hitungHargaSewa(hari);
        totalHarga += 50000* hari;
        if (kapasitasPenumpang > 5) {
            return totalHarga + 50000;
        }
        return totalHarga;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang + " Orang");
    }
}
