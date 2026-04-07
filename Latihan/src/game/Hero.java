package game;

public class Hero {
    private String nama;
    private double hp, attackPower;

    public Hero(String nama, double hp, double attackPower) {
        this.nama = nama;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void display(){
        System.out.println("=== Stat Hero ===");
        System.out.println("Nama: " + this.nama);
        System.out.println("HP: " + this.hp);
        System.out.println("Attack Power: " + this.attackPower);
        System.out.println("=================");
    }

    public void berlatih(){
        this.attackPower += 10;
        System.out.println(this.nama + " sedang berlatih.");
    }

    public void terimaSerangan(double damage){
        this.hp -= damage;
        System.out.println(this.nama + " menerima serangan sebesar " + damage);
    }
}
