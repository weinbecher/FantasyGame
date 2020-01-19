import behaivours.IEquip;
import characters.CharacterType;
import characters.Magician;
import items.ArmourType;
import items.PetType;
import items.SpellType;

public class MagicianTest {
    @Before
    public void before(){
        Magician magician1 = new Magician("Sophia",500,100, CharacterType.WITCH, PetType.HAMSTER, ArmourType.DIAMOND,
                SpellType.CURSE)

    }
}
