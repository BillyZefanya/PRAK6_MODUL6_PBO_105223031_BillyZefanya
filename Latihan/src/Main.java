import game.Hero;
import game.HeroStrength;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Jokowi", 100, 20);
        HeroStrength hero2 = new HeroStrength("Prabowo", 150, 25);

        // display awal
        hero1.display();
        hero2.display();

        // latihan
        hero1.berlatih();
        hero2.berlatih();

        // kena damage 50
        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);

        // display lagi
        hero1.display();
        hero2.display();
    }
}