package items;

import behaivours.IEquip;
import behaivours.IHeal;
import characters.Character;

public class Cure implements IEquip, IHeal {

    CureType  cureType;
    public Cure(CureType cureType) {
        this.cureType = cureType;
    }

    public CureType getCureType() {
        return cureType;
    }

    public void heal(Character target) {
        int targetHealthPoints = target.getHealthPoints();
        targetHealthPoints += cureType.getHealthIncrease();
        target.setHealthPoints(targetHealthPoints);
    }
}
