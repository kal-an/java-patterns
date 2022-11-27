package Creational.Builder;

public class Director {

    void constructSportCar(Builder builder) {
        String engine = "electric";
        builder.setGps();
        builder.setEngine(engine);
    }

    void contructSUV(Builder builder) {
        String engine = "diesel";
        builder.setEngine(engine);
    }
}
