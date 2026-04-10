package perusahaan;

public class Manajer extends Karyawan{
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String idKaryawan, String nama, int tahunMasuk, double ratingKinerja, double gajiPokok, String divisi, int jumlahAnggotaTim){
        super(idKaryawan, nama, tahunMasuk, ratingKinerja, gajiPokok);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    public String getDivisi(){
        return this.divisi;
    }

    public int getJumlahAnggotaTim(){
        return this.jumlahAnggotaTim;
    }

    @Override
    public double hitungGajiTotal(){
        double total = super.hitungGajiTotal();
        double tunjangan = getJumlahAnggotaTim()*300000;
        total += tunjangan;
        if(this.getRatingKinerja() > 4.5){
            total += (total*0.15);
        }  
        return total;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Divisi \t\t\t: " + getDivisi());
        System.out.println("Jumlah Anggota Tim \t: " + getJumlahAnggotaTim());
    }
}
