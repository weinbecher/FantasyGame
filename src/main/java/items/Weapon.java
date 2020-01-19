package items;

import behaivours.IEquip;
import behaivours.IWield;
import characters.Character;

public class Weapon implements IEquip, IWield {

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

    public void wield(Character target) {
        int targetHealthPoints = target.getHealthPoints();
        targetHealthPoints -= weaponType.getDamagePoints();
        target.setHealthPoints(targetHealthPoints);
    }
}
