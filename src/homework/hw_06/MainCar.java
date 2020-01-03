package homework.hw_06;

public class MainCar {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 6, 30);
        bmw.startMotor();
        bmw.gearDown();
        bmw.gearUp();
        bmw.showSpeed();
        bmw.gearUp();
        bmw.gearUp();
        bmw.gearUp();
        bmw.showSpeed();
        bmw.gearUp();
        bmw.gearUp();
        bmw.gearUp();
        bmw.gearUp();
        bmw.showSpeed();
        bmw.stopMotor();
        bmw.showSpeed();
        bmw.stopMotor();

    }
}
