package items;

import behaivours.ICast;

public class Ability {
    public SpellType spellType;


    public int Spell(){
        return this.spellType.getAttackValue();
    }

}
