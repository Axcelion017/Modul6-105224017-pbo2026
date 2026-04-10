package perusahaan;

public class Karyawan {
    private String idKaryawan, nama;
    private int tahunMasuk;
    private double gajiPokok, ratingKinerja;

    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double ratingKinerja, double gajiPokok){
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        setRatingKinerja(ratingKinerja);
        this.gajiPokok = gajiPokok;
        
    }

    public String getIdKaryawan(){
        return this.idKaryawan;
    }

    public String getNama(){
        return this.nama;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public int getTahunMasuk(){
        return this.tahunMasuk;
    }

    public double getRatingKinerja(){
        return this.ratingKinerja;
    }

    void setRatingKinerja(double ratingKinerja){
        if(ratingKinerja >= 1.0 && ratingKinerja <= 5.0){
            this.ratingKinerja = ratingKinerja;
        }else{
            this.ratingKinerja = 3.0;
        }
    }

    public double hitungGajiTotal(){
        int masaKerja = 2026 - this.tahunMasuk;
        if(masaKerja <0) masaKerja = 0;
        double bonusLoyalitas = (this.gajiPokok*0.05)*masaKerja;
        double total = this.gajiPokok + bonusLoyalitas;

        if(this.ratingKinerja < 2.5){
            return total*0.9;
        }
        return total;
        
    }

    public void displayInfo(){
        System.out.println("ID Karyawan \t\t: " + getIdKaryawan());
        System.out.println("Nama \t\t\t: " + getNama());
        System.out.println("Tahun Masuk \t\t: " + getTahunMasuk());
        System.out.println("Rating \t\t\t: " + getRatingKinerja());
        System.out.printf("Gaji Pokok \t\t: Rp%,.2f\n", getGajiPokok());
    }
}

