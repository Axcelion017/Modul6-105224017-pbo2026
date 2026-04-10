package perusahaan;

public class Developer extends Karyawan {
    private String level;
    private int jumlahBugFix;

    public Developer(String idKaryawan, String nama, int tahunMasuk, double ratingKinerja, double gajiPokok, String level, int jumlahBugFix){
        super(idKaryawan, nama, tahunMasuk, ratingKinerja, gajiPokok);
        setLevel(level);
        this.jumlahBugFix = jumlahBugFix;
    }

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
    }

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
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Level \t\t\t: " + getLevel());
        System.out.println("Bug Fixed \t\t: " + getJumlahBugFix());
    }
}
