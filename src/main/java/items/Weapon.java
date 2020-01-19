package items;

import behaivours.IEquip;

public class Weapon implements IEquip {

    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getWeaponTypeDamage() {
        return weaponType.getDamagePoints();
    }
}
