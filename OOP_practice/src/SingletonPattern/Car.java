package SingletonPattern;

public class Car {
    public static int serialId = 10001;
    private int carId;

    public Car() {
        this.carId = serialId;
        serialId++;
    }

    public int getCarNum() {
        return carId;
    }
}
