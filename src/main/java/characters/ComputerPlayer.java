package characters;

import behaivours.IEquip;
import behaivours.IGenerate;
import behaivours.IWield;
import items.Armour;
import items.Item;

public class ComputerPlayer extends HumanPlayer implements IGenerate {
    public ComputerPlayer(String name, int healthPoints, int manaPoints, CharacterType characterType, IEquip equipped, Armour armour) {
        super(name, healthPoints, manaPoints, characterType, equipped, armour);
    }

    public void generateEnemy(ComputerPlayer enemy) {

    }

    public void generateItem(Item treasure) {

    }


}
