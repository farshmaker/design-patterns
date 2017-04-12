package by.epam.patterns.behavioral.strategy.game.characters;

import by.epam.patterns.behavioral.strategy.game.impl.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        weapon = new SwordBehavior();
    }
}
