package rental;

public class Motor extends Kendaraan{
    int kapasitasMesin;
    public Motor(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasMesin){
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public double hitungHargaSewa(int hari) {
        double totalHarga = super.hitungHargaSewa(hari);
        if (kapasitasMesin >= 250) {
            return totalHarga += 25000 * hari;
        }
        return totalHarga;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " CC");
    }

}
