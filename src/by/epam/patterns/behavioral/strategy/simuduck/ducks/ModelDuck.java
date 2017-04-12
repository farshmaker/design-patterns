package by.epam.patterns.behavioral.strategy.simuduck.ducks;

import by.epam.patterns.behavioral.strategy.simuduck.impl.fly.FlyNoWay;
import by.epam.patterns.behavioral.strategy.simuduck.impl.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
