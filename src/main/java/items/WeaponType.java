package items;

public enum WeaponType {
    HAMMER(40),
    SWORD(60),
    AX(50),
    CHOPSTICK(10);

    private int damagePoints;

    WeaponType(int damagePoints){
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }
}
