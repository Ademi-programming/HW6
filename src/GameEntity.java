public class GameEntity {
    private int damage;
    private int health;

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public GameEntity(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }
}
