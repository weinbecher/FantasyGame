package items;

import behaivours.IEquip;
import behaivours.IGenerate;
import characters.ComputerPlayer;

public class Item implements IEquip, IGenerate {
    int healthIncrease;
    int manoIncrease;
    int price;

    public Item(int healthIncrease, int manoIncresase, int price) {
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

    public void generateEnemy(ComputerPlayer enemy) {
    }

    public void generateItem(Item treasure) {

    }


}
