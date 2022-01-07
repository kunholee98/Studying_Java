package TempleteMethod;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("직접 운전을 합니다.");
        System.out.println("운전자가 직접 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("운전자가 직접 브레이크를 밟아 멈춥니다.");
    }
    
}
