package Behavioral.TemplateMethod;

abstract public class GameAI {

    final public void turn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    public void collectResources() {
        //to do something
    }

    abstract public void buildStructures();

    abstract public void buildUnits();

    public void attack() {
        sendScouts(30);
    }

    abstract public void sendScouts(int position);

    abstract public void sendWarriors(int position);

}
