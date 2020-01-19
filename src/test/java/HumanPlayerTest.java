import behaivours.ICast;
import behaivours.IEquip;
import characters.CharacterType;
import characters.HumanPlayer;
import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HumanPlayerTest {
    HumanPlayer welsh;
    IEquip hammer;
    ICast curse;
    Item coffee;
    Armour feltArmour;

    @Before
    public void before(){
        feltArmour = new Armour(ArmourType.FELT);
        hammer = new Weapon(WeaponType.HAMMER);
        coffee = new Item(10,30,10);
        welsh = new HumanPlayer("Nate",2000,500,CharacterType.WELSH, hammer,feltArmour);

    }

    @Test
    public void hasName(){
        assertEquals("Nate", welsh.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(2000, welsh.getHealthPoints());
    }

    @Test
    public void hasManaPoints(){
        assertEquals(500, welsh.getManaPoints());
    }


    @Test
    public void hasCharacterType(){
        assertEquals(CharacterType.WELSH, welsh.getCharacterType());
    }

    @Test
    public void hasEquipped(){
        assertEquals(hammer, welsh.getEquipped());
    }

    @Test
    public void hasArmour(){
        assertEquals(feltArmour, welsh.getArmour());
    }

    @Test
    public void hasItems(){
        assertEquals(0,welsh.getItems().size());
    }

    @Test
    public void canAddItems(){
        welsh.addItems(coffee);
        assertEquals(1,welsh.getItems().size());
    }


}



