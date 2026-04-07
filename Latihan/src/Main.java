import game.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("Alex", 100.0,20.0);
        HeroStrength hero2 = new HeroStrength("Mike", 150.0, 30.0);
        hero1.display();
        hero2.display();

        hero1.berlatih();
        hero2.berlatih();

        hero1.terimaSerangan(50.0);
        hero2.terimaSerangan(50.0);
        hero1.display();
        hero2.display();
    }
}
