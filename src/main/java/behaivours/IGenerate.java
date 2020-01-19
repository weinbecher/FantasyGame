package behaivours;

import characters.ComputerPlayer;
import characters.HumanPlayer;
import items.Item;

public interface IGenerate {
    void generateEnemy(ComputerPlayer enemy);

    void generateItem(Item treasure);
}
