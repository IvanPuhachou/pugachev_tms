package homework.hw_05;

public class Passengers extends Ground {
    private String bodyType;
    private int numberPassengers;

    public Passengers(String model, String bodyType, int power, int maxSpeed, int weight, int numberWheels, double consumption, int numberPassengers) {
        super(model, power, maxSpeed, weight, numberWheels, consumption);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public String distanceAndExpenditure(double time) {
        return " За время " + time + " ч, автомобиль " + getModel() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " проедет " + distance(time) + " км  и израсходует " +
                expenditure(distance(time)) + " литров топлива.";
    }

    private double distance(double b) {
        return getMaxSpeed() * b;
    }

    private double expenditure(double a) {
        return getConsumption() * a / 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", bodyType='" + bodyType + '\'' +
                ", numberPassengers=" + numberPassengers;
    }
}
