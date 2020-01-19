package items;

import behaivours.ICast;

public enum SpellType implements ICast {
    CURSE(50,0,-10),
    FIREBALL(30,20,-5),
    PORTAL(0,200,-20),
    SHIELD(0,100,-10);

    public int attackValue;
    public int defenceValue;
    public int manaCost;

    SpellType(int attackValue, int defenceValue, int manaCost){
        this.attackValue = attackValue;
        this.defenceValue = defenceValue;
        this.manaCost = manaCost;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getDefenceValue() {
        return defenceValue;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void cast() {
    }
}
