package by.epam.patterns.behavioral.strategy.simuduck.ducks;

import by.epam.patterns.behavioral.strategy.simuduck.impl.fly.FlyWithWings;
import by.epam.patterns.behavioral.strategy.simuduck.impl.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallar duck!");
    }
}
