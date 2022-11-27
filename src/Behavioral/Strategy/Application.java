package Behavioral.Strategy;

import Behavioral.Strategy.impl.ConcreteStrategyAdd;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        //if (action == addition)
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyAdd());
        int result = context.executeStrategy(4, 5);
        System.out.println(result);
    }
}
