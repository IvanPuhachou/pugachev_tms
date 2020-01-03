package homework.hw_05;

public class Transport {
    private static final double KW_MULTIPLIER =  0.74;
    private int power;
    private int maxSpeed;
    private int weight;
    private String model;

    public Transport(String model, int power, int maxSpeed, int weight) {
        this.model = model;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double powerKw() {
        return  getPower() * KW_MULTIPLIER;
    }

    @Override
    public String toString() {
        return "Transport: " +
                "model='" + model + '\'' +
                ", power=" + power +
                ", power in KW=" + powerKw() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight;
    }
}
