package Minimarket;

public class Produk{
    String namaProduk;
    double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public void tampilkanDetail() {
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Harga: " + this.harga);
    }
}

public class MakananRingan extends Produk{
    String rasa;

    public MakananRingan(String namaProduk, double harga, String rasa) {
        super(namaProduk, harga);
        this.rasa = rasa;
    }

    public void tampilkanDetail(){
        super.tampilkanDetail();
        System.out.println("Rasa: " + this.rasa);
    }
}