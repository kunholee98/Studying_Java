package TempleteMethod;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        Car mCar = new ManualCar();
        aiCar.run();
        mCar.run();
    }
}
