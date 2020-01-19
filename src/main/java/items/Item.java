package items;

import behaivours.IEquip;

public class Item implements IEquip {
    int healthIncrease;
    int manoIncrease;
    int price;

    public Item(int healthIncrease, int manoIncresase, int price){
        this.healthIncrease = healthIncrease;
        this.manoIncrease = manoIncresase;
        this.price = price;
    }

    public int getHealthIncrease() {
        return healthIncrease;
    }

    public int getManoIncrease() {
        return manoIncrease;
    }

    public int getGold() {
        return price;
    }
}
