import behaivours.ICast;
import behaivours.IEquip;
import characters.CharacterType;
import characters.HumanPlayer;
import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HumanPlayerTest {
    HumanPlayer cleric;
    HumanPlayer welsh;
    IEquip hammer;
    IEquip honey;
    IEquip sword;
    ICast curse;
    Item coffee;
    Armour feltArmour;
    Armour leatherArmour;

    @Before
    public void before(){
        feltArmour = new Armour(ArmourType.FELT);
        leatherArmour = new Armour(ArmourType.LEATHER);
        hammer = new Weapon(WeaponType.HAMMER);
        honey = new Cure(CureType.HONEY);
        sword = new Weapon(WeaponType.SWORD);
        coffee = new Item(10,30,10);
        welsh = new HumanPlayer("Nate",2000,500,CharacterType.WELSH, hammer,feltArmour);
        cleric = new HumanPlayer("Audrey",200,300, CharacterType.CLERIC, honey, leatherArmour );

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

    @Test
    public void canChangeWeapon(){
        welsh.setEquipped(sword);
        assertEquals(sword,welsh.getEquipped());
    }


    @Test
    public void canFightWithWeapon(){
        welsh.wield(cleric);
        assertEquals(175, cleric.getHealthPoints());
    }

    @Test
    public void canHealWithCure(){
        welsh.wield(cleric);
        cleric.heal(cleric);
        assertEquals(275,cleric.getHealthPoints());
    }

    @Test
    public void canNotWeildWithCure(){
        cleric.wield(welsh);
        assertEquals(2000,welsh.getHealthPoints());
    }


}



