package by.epam.patterns.behavioral.strategy.simuduck.impl.fly;

import by.epam.patterns.behavioral.strategy.simuduck.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly:(");
    }
}
