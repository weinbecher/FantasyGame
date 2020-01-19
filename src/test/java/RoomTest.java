import behaivours.ICast;
import behaivours.IEquip;
import characters.CharacterType;
import characters.ComputerPlayer;
import characters.HumanPlayer;
import items.*;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room1;
    HumanPlayer cleric;
    HumanPlayer welsh;
    ComputerPlayer knight;
    IEquip hammer;
    IEquip honey;
    IEquip sword;
    ICast curse;
    Item coffee;
    Armour feltArmour;
    Armour leatherArmour;
    Armour metalArmour;

    @Before
    public void before(){
        room1 = new Room("Cave");
        feltArmour = new Armour(ArmourType.FELT);
        leatherArmour = new Armour(ArmourType.LEATHER);
        metalArmour = new Armour(ArmourType.METAL);
        hammer = new Weapon(WeaponType.HAMMER);
        honey = new Cure(CureType.HONEY);
        sword = new Weapon(WeaponType.SWORD);
        coffee = new Item(10,30,10);
        welsh = new HumanPlayer("Nate",2000,500, CharacterType.WELSH, hammer,feltArmour);
        knight = new ComputerPlayer("HandsomeBoy",100,500, CharacterType.KNIGHT, sword,feltArmour);
        cleric = new HumanPlayer("Audrey",200,300, CharacterType.CLERIC, honey, leatherArmour );
    }

    @Test
    public void roomHasName(){
        assertEquals("Cave",room1.getName());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0,room1.getEnemies().size());
        assertEquals(0,room1.getTreasure().size());
    }

    @Test
    public void roomCanAddEnemy(){
        room1.generateEnemy(knight);
        assertEquals(1,room1.getEnemies().size());
    }

    @Test
    public void roomCanAddItem(){
        room1.generateItem(coffee);
        assertEquals(1,room1.getTreasure().size());
    }

    @Test
    public void collectTreasureAfterKillingEnemy(){
        room1.generateEnemy(knight);
        room1.generateItem(coffee);
        room1.fight(welsh, knight);
        room1.fight(welsh, knight);
        room1.fight(welsh, knight);
//        assertEquals("Wasted",knight.getHealthPoints());
        assertEquals(1,welsh.getItems().size());
    }

}
