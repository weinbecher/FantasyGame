import behaivours.ICast;
import behaivours.IEquip;
import behaivours.IWield;
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
    ICast portal;
    Item coffee;


    @Before
    public void before(){
        diamondArmour = new Armour(ArmourType.DIAMOND);
        feltArmour = new Armour(ArmourType.FELT);
        hammer = new Weapon(WeaponType.HAMMER);
        hamster = new Pet(PetType.HAMSTER,100);
        portal = new Spell(SpellType.PORTAL);
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
    public void canChangeSpell(){
        magician.changeSpell(portal);
        assertEquals(portal,magician.getSpell());
    }

    @Test
    public void petCanDefend(){
        welsh.wield(magician);
        welsh.wield(welsh);
        assertEquals(500,magician.getHealthPoints());
        assertEquals(1965,welsh.getHealthPoints());

    }


}
