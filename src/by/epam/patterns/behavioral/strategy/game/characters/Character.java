package by.epam.patterns.behavioral.strategy.game.characters;

import by.epam.patterns.behavioral.strategy.game.interfaces.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
