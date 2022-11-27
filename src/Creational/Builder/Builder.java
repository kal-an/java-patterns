package Creational.Builder;

public interface Builder {
    void reset();
    void setSeats(Integer number);
    void setEngine(String engine);
    void setGps();
}
