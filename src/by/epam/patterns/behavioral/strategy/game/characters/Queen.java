package by.epam.patterns.behavioral.strategy.game.characters;

import by.epam.patterns.behavioral.strategy.game.impl.BowAndArrowBehavior;

public class Queen extends Character {

    public Queen() {
        weapon = new BowAndArrowBehavior();
    }
}
