package Creational.Builder;

public class Application {
    private Director director;
    public static void main(String[] args) {
        Application application = new Application();
        application.makeCar();
    }

    void makeCar() {
        director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car car = carBuilder.getResult();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
    }
}
