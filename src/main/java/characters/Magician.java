package characters;
import characters.Character;
import behaivours.ICast;
import behaivours.IEquip;
import behaivours.IHeal;
import items.Armour;
import items.Spell;

import java.util.ArrayList;

public class Magician extends HumanPlayer{
    private ICast spell;


    public Magician(String name, int healthPoints, int manaPoints,CharacterType characterType, IEquip equipped,
                    Armour armour,
                    ICast spell) {
        super(name, healthPoints, manaPoints,characterType, equipped, armour);

        this.spell = spell;
    }

    public ICast getSpell() {
        return this.spell;
    }

    public void cast(Character target) {
        if(spell instanceof ICast){
            ((ICast)spell).cast(target);
            target.armourStopDamage();
        }
    }
}
