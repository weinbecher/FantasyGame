package items;

public enum PetType {
    HAMSTER(10),
    DUCK(20),
    RABBIT(30),
    DRAGON(50),
    RAVEN(30),
    SNAKE(20);

    private int defenceValue;

    PetType(int defenceValue){
        this.defenceValue = defenceValue;
    }


    public int getDefenceValue() {
        return defenceValue;
    }
}
