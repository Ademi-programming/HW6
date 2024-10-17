public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int damage, int health, Weapon weapon) {
        super(damage, health);
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Health: " + this.getHealth() + " Damage: " + this.getDamage() +
                " WeaponType: " + weapon.getType() + " Weapon Name: " + weapon.getName();
    }
}
