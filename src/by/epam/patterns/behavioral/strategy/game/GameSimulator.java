package by.epam.patterns.behavioral.strategy.game;

import by.epam.patterns.behavioral.strategy.game.characters.Character;
import by.epam.patterns.behavioral.strategy.game.characters.Troll;
import by.epam.patterns.behavioral.strategy.game.impl.KnifeBehavior;

public class GameSimulator {

    public static void main(String[] args) {
        Character troll = new Troll();
        troll.fight();
        troll.setWeapon(new KnifeBehavior());
        troll.fight();

    }
}
