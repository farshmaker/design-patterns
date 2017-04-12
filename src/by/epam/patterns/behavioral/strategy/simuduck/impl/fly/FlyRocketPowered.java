package by.epam.patterns.behavioral.strategy.simuduck.impl.fly;

import by.epam.patterns.behavioral.strategy.simuduck.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
