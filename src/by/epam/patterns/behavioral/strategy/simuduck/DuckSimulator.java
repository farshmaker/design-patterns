package by.epam.patterns.behavioral.strategy.simuduck;

import by.epam.patterns.behavioral.strategy.simuduck.ducks.Duck;
import by.epam.patterns.behavioral.strategy.simuduck.ducks.MallardDuck;
import by.epam.patterns.behavioral.strategy.simuduck.ducks.ModelDuck;
import by.epam.patterns.behavioral.strategy.simuduck.impl.fly.FlyRocketPowered;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.quack();

        Duck model = new ModelDuck();
        model.fly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.fly();
    }
}
