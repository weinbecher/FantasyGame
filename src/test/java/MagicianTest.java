import behaivours.IEquip;
import characters.CharacterType;
import characters.Magician;
import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class MagicianTest {
    Magician magician1;
    Armour diamondArmour;
    IEquip hamster;


    @Before
    public void before(){
        Armour diamondArmour = new Armour(ArmourType.DIAMOND);
        IEquip hamster = new Pet(PetType.HAMSTER,100);
        magician1 = new Magician("Sophia",500,100, CharacterType.WITCH, hamster , diamondArmour, SpellType.CURSE);
    }

    @Test
    public void hasName(){
        assertEquals("Sophia", magician1.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(500, magician1.getHealthPoints());
    }
//
//    @Test
//    public void hasWallet(){
//        assertEquals(50, magician1.getWallet());
//    }
//
//    @Test
//    public void hasClassType(){
//        assertEquals(ClassType.WITCH, magician1.getCharacterClass());
//    }
//
//    @Test
//    public void hasAnimalType(){
//        assertEquals(AnimalType.BORROWER, magician1.getAnimalType());
//    }
//
//    @Test
//    public void hasEquippedItem(){
//        assertEquals(crystalBall, magician1.getEquipped());
//    }
//
}
