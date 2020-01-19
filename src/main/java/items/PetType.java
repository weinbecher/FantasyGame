package items;

public enum PetType {
    HAMSTER(300,10),
    DUCK(200,20),
    RABBIT(200,30),
    DRAGON(1000,50),
    RAVEN(200,30),
    SNAKE(100,200);

    private int healthPoints;
    private int defenceValue;

    PetType(int healthPoints, int defenceValue){
        this.healthPoints = healthPoints;
        this.defenceValue = defenceValue;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDefenceValue() {
        return defenceValue;
    }
}
