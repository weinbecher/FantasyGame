package items;

import behaivours.IEquip;

public class Pet implements IEquip {
    private PetType petType;

    public Pet(PetType petType){
        this.petType = petType;
    }

    public int getPetHealthPoints() {
        return petType.getHealthPoints();
    }

    public int getPetDefenceValue(){
        return petType.getDefenceValue();
    }

}
