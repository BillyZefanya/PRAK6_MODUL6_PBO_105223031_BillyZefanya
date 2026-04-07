package game;

public class HeroStrength extends Hero {
    String tipe = "Strength";

    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipe: " + tipe);
    }

    @Override
    public void terimaSerangan(double damage) {
        double finalDamage = damage * 0.5;
        health -= finalDamage;
        System.out.println(nama + " menerima damage (50%): " + finalDamage);
    }
}