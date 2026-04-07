package game;

public class Hero {
    String nama;
    double health;
    double attackPower;

    public Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Nama Hero: " + nama);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }

    public void berlatih() {
        attackPower += 10;
        System.out.println(nama + " sedang berlatih.");
    }

    public void terimaSerangan(double damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(nama + " menerima damage: " + damage);
    }
}