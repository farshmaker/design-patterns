package by.epam.patterns.behavioral.strategy.simuduck.impl.quack;

import by.epam.patterns.behavioral.strategy.simuduck.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
