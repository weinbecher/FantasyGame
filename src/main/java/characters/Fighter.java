package characters;

import behaivours.IEquip;
import items.Armour;
import items.Item;
import items.Weapon;

import java.util.ArrayList;

public class Fighter extends HumanPlayer{
    public Fighter(String name, int healthPoints, int manaPoints, CharacterType characterType, IEquip equipped, Armour armour) {
        super(name, healthPoints, manaPoints, characterType, equipped, armour);

    }
}
