package rooms;

import behaivours.IGenerate;
import behaivours.IWield;
import characters.ComputerPlayer;
import characters.HumanPlayer;
import characters.Magician;
import items.Item;

import java.util.ArrayList;

public class Room implements IGenerate {

    private ArrayList<ComputerPlayer> enemies;
    private ArrayList<Item> treasures;
    private String name;

    public Room(String name) {
        this.name = name;
        this.enemies = new ArrayList<ComputerPlayer>();
        this.treasures = new ArrayList<Item>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<ComputerPlayer> getEnemies() {
        return new ArrayList<ComputerPlayer>(enemies);
    }

    public ArrayList<Item> getTreasure() {
        return new ArrayList<Item>(treasures);
    }

    public void generateEnemy(ComputerPlayer enemy) {
        enemies.add(enemy);
    }

    public void generateItem(Item treasure) {
        treasures.add(treasure);
    }

    public void fight(HumanPlayer humanPlayer, ComputerPlayer computerPlayer) {

        if (humanPlayer.getEquipped() instanceof IWield) {
                humanPlayer.wield(computerPlayer);
                } else ((Magician) humanPlayer).cast(computerPlayer);
                computerPlayer.wield(humanPlayer);

        if (computerPlayer.getHealthPoints() < 0) {
            for (Item treasure : treasures) {
                humanPlayer.addItems(treasure);
            }
        }

    }

}