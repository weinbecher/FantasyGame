package items;

public enum ArmourType {
    FELT(5),
    LEATHER(15),
    METAL(20),
    DIAMOND(40);


    private int defenceValue;
    ArmourType(int defenceValue) {
        this.defenceValue = defenceValue;
    }


    public int getDefenceValue() {
        return defenceValue;
    }
}
