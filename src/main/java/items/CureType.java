package items;

public enum CureType {
    HONEY(100,100, 30),
    CHOCOLATE(200,100,50),
    CUPCAKE(200,300,30),
    LOVE(100,100,0);

    int healthIncrease;
    int manoIncrease;
    int manoCost;

    CureType(int healthIncrease, int manoIncrease, int manoCost){
        this.healthIncrease = healthIncrease;
        this.manoIncrease = manoIncrease;
        this.manoCost = manoCost;
    }

    public int getHealthIncrease() {
        return healthIncrease;
    }

    public int getManoIncrease() {
        return manoIncrease;
    }

    public int getManoCost() {
        return manoCost;
    }
}
