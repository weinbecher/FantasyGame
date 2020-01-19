package items;

public class Armour {
    private ArmourType armourType;

    public Armour(ArmourType armourType) {
        this.armourType = armourType;
    }

    public ArmourType getArmourType() {
        return armourType;
    }

    public int getArmourDefenseValue(){
        return armourType.getDefenceValue();
    }

}
