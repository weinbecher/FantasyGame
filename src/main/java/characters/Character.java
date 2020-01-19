package characters;

import behaivours.IEquip;
import items.Armour;

public class Character {
    private String name;
    private int healthPoints;
    private int manaPoints;
    private CharacterType characterType;
    private IEquip equipped;
    private Armour armour;

    public Character(String name, int healthPoints, int manaPoints, CharacterType characterType, IEquip equipped,
                     Armour armour) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.characterType = characterType;
        this.equipped = equipped;
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public IEquip getEquipped() {
        return equipped;
    }

    public Armour getArmour() {
        return armour;
    }
}
