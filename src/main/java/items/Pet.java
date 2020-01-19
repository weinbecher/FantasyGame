package items;

import behaivours.IEquip;

public class Pet implements IEquip {
    private PetType petType;
    private int healthPoints;

    public Pet(PetType petType, int healthPoints){
        this.petType = petType;
        this.healthPoints = healthPoints;
    }

    public int getPetDefenceValue(){
        return petType.getDefenceValue();
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
