public class Main {
    public static void main(String[] args) {

        Weapon AK47 = new Weapon(WeaponType.AK47, "Ak47");
        Weapon BOW = new Weapon(WeaponType.BOW, "BOW");
        Weapon DAGGER = new Weapon(WeaponType.G36, "G36");

        Boss boss = new Boss(350, 200, AK47);
        System.out.println("Boss Info: \n" + boss.printInfo());
        Skeleton sceleton1 = new Skeleton(50, 100, BOW, 20);
        Skeleton sceleton2 = new Skeleton(20, 70, DAGGER, 30);
        System.out.println("Skeleton 1 info: \n" + sceleton1.printInfo());
        System.out.println("Skeleton 2 info: \n" + sceleton2.printInfo());
    }
}
