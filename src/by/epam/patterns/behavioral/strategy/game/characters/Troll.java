package by.epam.patterns.behavioral.strategy.game.characters;

import by.epam.patterns.behavioral.strategy.game.impl.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weapon = new AxeBehavior();
    }
}
