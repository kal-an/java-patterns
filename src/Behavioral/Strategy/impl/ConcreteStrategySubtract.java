package Behavioral.Strategy.impl;

import Behavioral.Strategy.Strategy;

public class ConcreteStrategySubtract implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
