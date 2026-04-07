package game;

public class HeroStrength extends Hero{
    private String tipe;

    public HeroStrength(String nama, double hp, double attackPower) {
        super(nama, hp, attackPower);
        this.tipe = "Strength";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipe\t\t: " + this.tipe);
        System.out.println("==========================");
    }

    @Override
    public  void terimaSerangan(double damage) {
        super.terimaSerangan(damage * 0.5);
    }
}
