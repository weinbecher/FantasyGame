package characters;

import behaivours.IEquip;
import behaivours.IHeal;
import behaivours.IWield;
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


    public void wield(Character target) {
        IEquip weapon = getEquipped();
        if (weapon instanceof IWield){
            ((IWield) weapon).wield(target);
            target.armourStopDamage();
        }

        if (target instanceof Magician){
            ((Magician)target).petStopDamage();
        }
    }

    public void heal(Character target){
        IEquip cure = getEquipped();
        if(cure instanceof IHeal){
            ((IHeal)cure).heal(target);
        };
    }

}



