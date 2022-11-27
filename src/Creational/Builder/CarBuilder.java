package Creational.Builder;

public class CarBuilder implements Builder {

    private Car car = new Car();

    @Override
    public void reset() {

    }

    @Override
    public void setSeats(Integer number) {

    }

    @Override
    public void setEngine(String engine) {

    }

    @Override
    public void setGps() {

    }

    public Car getResult() {
        return car;
    }
}
