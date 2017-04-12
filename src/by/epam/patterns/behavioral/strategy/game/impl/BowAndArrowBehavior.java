package by.epam.patterns.behavioral.strategy.game.impl;

import by.epam.patterns.behavioral.strategy.game.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Shot with a bow");
    }
}
