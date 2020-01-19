package items;

import behaivours.ICast;

public class Spell implements ICast {
    private SpellType spell;
    public Spell(SpellType spell){
        this.spell = spell;
    }

    public SpellType getSpell() {
        return spell;
    }

    public int getSpellAttackValue(){
        return spell.getAttackValue();
    }

    public int getSpellDefenceValue(){
        return spell.getDefenceValue();
    }

    public int getSpellManaCost(){
        return spell.getManaCost();
    }

    public void cast() {

    }
}
