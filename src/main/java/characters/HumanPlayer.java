package characters;

import behaivours.IEquip;
import items.Armour;
import items.Item;
import items.Weapon;

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


    public int wield(Character enemy) {
        //int enemyHealthPoint = enemy.getHealthPoints();
        int enemyHealthPoint = enemy.getHealthPoints() - ((Weapon)getEquipped()).getWeaponTypeDamage();
        return enemyHealthPoint;
    }
}
