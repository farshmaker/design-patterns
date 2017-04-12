package by.epam.patterns.behavioral.strategy.game.impl;

import by.epam.patterns.behavioral.strategy.game.interfaces.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Kicking with axe");
    }
}
