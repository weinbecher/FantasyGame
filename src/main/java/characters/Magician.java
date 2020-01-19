package characters;
import behaivours.ICast;
import behaivours.IEquip;
import items.Armour;
import items.Spell;

import java.util.ArrayList;

public class Magician extends HumanPlayer{
    private ICast spell;


    public Magician(String name, int healthPoints, CharacterType characterType, IEquip equipped, Armour armour,
                    ICast spell) {
        super(name, healthPoints, characterType, equipped, armour);

        this.spell = spell;
    }
}
