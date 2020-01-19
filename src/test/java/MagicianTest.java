import behaivours.ICast;
import behaivours.IEquip;
import characters.CharacterType;
import characters.Magician;
import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class MagicianTest {
    Magician magician;
    Armour diamondArmour;
    IEquip hamster;
    ICast curse;
    Item coffee;


    @Before
    public void before(){
        diamondArmour = new Armour(ArmourType.DIAMOND);
        hamster = new Pet(PetType.HAMSTER,100);
        curse = new Spell(SpellType.CURSE);
        coffee = new Item(10,30,10);
        magician = new Magician("Sophia",500,100, CharacterType.WITCH, hamster, diamondArmour, curse);

    }

    @Test
    public void hasSpell(){
        assertEquals(curse, magician.getSpell());
    }


}
