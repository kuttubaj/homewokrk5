public class Hero {
    private int health;
    private int damage;
    private String teleport;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getTeleport() {
        return teleport;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String Teleport) {
        this.health = health;
        this.damage = damage;
        this.teleport = Teleport;
    }
}