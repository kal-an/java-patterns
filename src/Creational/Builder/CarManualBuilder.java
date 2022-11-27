package Creational.Builder;

public class CarManualBuilder implements Builder {

    private Manual manual = new Manual();

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

    public Manual getResult() {
        return manual;
    }
}
