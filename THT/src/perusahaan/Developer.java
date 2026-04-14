package perusahaan;

public class Developer extends Karyawan {
    private String level;
    private int jumlahBugFix;

    public Developer(String idKaryawan, String nama, int tahunMasuk, double ratingKinerja, double gajiPokok, String level, int jumlahBugFix){
        super(idKaryawan, nama, tahunMasuk, ratingKinerja, gajiPokok);
        setLevel(level);
        this.jumlahBugFix = jumlahBugFix;
    } //Developer dengan identifikasi tambahan level dan jumlah bug fix

    public String getLevel(){
        return this.level;
    }

    public int getJumlahBugFix(){
        return this.jumlahBugFix;
    }

    void setLevel(String level){
        if("Senior".equalsIgnoreCase(level)){
            this.level = "Senior";
        }else if("Mid".equalsIgnoreCase(level)){
            this.level = "Mid";
        }else{
            this.level = "Junior";
        }
    } //Memvalidasi jika input untuk level developer adalah antara Senior, Mid, dan Junior, jika tidak valid maka akan set default Junior

    @Override
    public double hitungGajiTotal(){
        double total = super.hitungGajiTotal();
        double tunjangan;

        if("Senior".equals(this.level)) tunjangan = 3000000;
        else if("Mid".equals(this.level)) tunjangan = 1500000;
        else tunjangan = 0;

        total += tunjangan;

        if(this.getRatingKinerja() >= 3.0){
            double bonusbug = this.jumlahBugFix * 50000;
            total += bonusbug;
        }
        return total;
    }//Override dari kelas karyawan dengan ekstensi khusus developer dengan tunjangan berdasarkan level dan jika kinerja lebih dari sama dengan 3.0 maka mendapatkan bonus bug per bugnya adalah 50000

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Level \t\t\t: " + getLevel());
        System.out.println("Bug Fixed \t\t: " + getJumlahBugFix());
    }
}
