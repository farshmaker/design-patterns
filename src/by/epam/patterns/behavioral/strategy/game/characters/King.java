package by.epam.patterns.behavioral.strategy.game.characters;

import by.epam.patterns.behavioral.strategy.game.impl.KnifeBehavior;

public class King extends Character {

    public King() {
        weapon = new KnifeBehavior();
    }
}
