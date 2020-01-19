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
    public void hasName(){
        assertEquals("Sophia", magician.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(500, magician.getHealthPoints());
    }

    @Test
    public void hasManaPoints(){
        assertEquals(100, magician.getManaPoints());
    }


    @Test
    public void hasCharacterType(){
        assertEquals(CharacterType.WITCH, magician.getCharacterType());
    }

    @Test
    public void hasEquipped(){
        assertEquals(hamster, magician.getEquipped());
    }

    @Test
    public void hasArmour(){
        assertEquals(diamondArmour, magician.getArmour());
    }

    @Test
    public void hasSpell(){
        assertEquals(curse, magician.getSpell());
    }

    @Test
    public void hasItems(){
        assertEquals(0,magician.getItems().size());
    }

    @Test
    public void canAddItems(){
        magician.addItems(coffee);
        assertEquals(1,magician.getItems().size());
    }

}
