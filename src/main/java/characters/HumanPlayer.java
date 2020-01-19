package characters;

import behaivours.IEquip;
import items.Armour;
import items.Item;

import java.util.ArrayList;

public class HumanPlayer extends Character{
    private ArrayList<Item> items;

    public HumanPlayer(String name, int healthPoints, int manaPoints, CharacterType characterType, IEquip equipped, Armour armour) {
        super(name, healthPoints, manaPoints, characterType, equipped, armour);
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<Item>(items);
    }

    public void addItems(Item item) {
        items.add(item);
    }
}
