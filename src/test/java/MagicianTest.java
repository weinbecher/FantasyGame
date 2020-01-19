import behaivours.ICast;
import behaivours.IEquip;
import characters.CharacterType;
import characters.HumanPlayer;
import characters.Magician;
import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class MagicianTest {
    HumanPlayer welsh;
    IEquip hammer;
    Magician magician;
    Armour diamondArmour;
    Armour feltArmour;
    IEquip hamster;
    ICast curse;
    Item coffee;


    @Before
    public void before(){
        diamondArmour = new Armour(ArmourType.DIAMOND);
        feltArmour = new Armour(ArmourType.FELT);
        hamster = new Pet(PetType.HAMSTER,100);
        curse = new Spell(SpellType.CURSE);
        coffee = new Item(10,30,10);
        welsh = new HumanPlayer("Nate",2000,500,CharacterType.WELSH, hammer,feltArmour);
        magician = new Magician("Sophia",500,100, CharacterType.WITCH, hamster, diamondArmour, curse);

    }

    @Test
    public void hasSpell(){
        assertEquals(curse, magician.getSpell());
    }

    @Test
    public void canCast(){
        magician.cast(welsh);
        assertEquals(1955, welsh.getHealthPoints());
    }

    @Test
    public void petCanDefend(){
        welsh.wield(magician);
        assertEquals(500,magician.getHealthPoints());
    }


}
